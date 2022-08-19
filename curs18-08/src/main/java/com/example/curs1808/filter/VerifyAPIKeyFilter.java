package com.example.curs1808.filter;

import com.example.curs1808.service.ApiKeyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@RequiredArgsConstructor
public class VerifyAPIKeyFilter extends OncePerRequestFilter {
    private final ApiKeyService apiKeyService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String pathInfo = request.getRequestURI();
        if (!pathInfo.equals("/api-key")) {
            String apiKeyFromHeader = request.getHeader("key");
            if (apiKeyFromHeader == null)
                apiKeyFromHeader = request.getParameter("key");

            if (apiKeyFromHeader == null || !apiKeyService.validateApiKey(apiKeyFromHeader)) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
                return;
            }
        }
        filterChain.doFilter(request, response);
    }
}

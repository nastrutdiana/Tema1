package com.example.curs1808.controller;

import com.example.curs1808.model.ApiKey;
import com.example.curs1808.service.ApiKeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api-key")
public class ApiKeyController {
    private final ApiKeyService apiKeyService;

    @GetMapping
    private ApiKey createApiKey() {
        return apiKeyService.createApiKey();
    }
}

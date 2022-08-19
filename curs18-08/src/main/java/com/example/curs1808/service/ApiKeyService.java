package com.example.curs1808.service;

import com.example.curs1808.model.ApiKey;
import com.example.curs1808.repository.ApiKeyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ApiKeyService {
    private final ApiKeyRepository apiKeyRepository;

    public ApiKey createApiKey() {
        return apiKeyRepository
                .save(ApiKey.builder()
                        .isActive(true)
                        .apiKey(UUID.randomUUID().toString())
                        .build());
    }

    public boolean validateApiKey(String apiKey) {
        ApiKey apk = findApiKey(apiKey);
        return apk != null && apk.isActive();
    }

    private ApiKey findApiKey(String apiKey) {
        return apiKeyRepository.findApiKeyByApiKey(apiKey);
    }
}

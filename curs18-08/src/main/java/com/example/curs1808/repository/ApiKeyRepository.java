package com.example.curs1808.repository;

import com.example.curs1808.model.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiKeyRepository extends JpaRepository<ApiKey, Integer> {
    ApiKey findApiKeyByApiKey(String apiKey);
}

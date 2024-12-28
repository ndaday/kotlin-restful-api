package com.hiday.kotlin_restful_api.repository

import com.hiday.kotlin_restful_api.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKey, String> {
}
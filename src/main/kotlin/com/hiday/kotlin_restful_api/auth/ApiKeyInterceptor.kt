package com.hiday.kotlin_restful_api.auth

import com.hiday.kotlin_restful_api.error.UnauthorizedException
import com.hiday.kotlin_restful_api.repository.ApiKeyRepository
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor
import java.lang.Exception

@Component
class ApiKeyInterceptor(val apiKeyRepository: ApiKeyRepository) : WebRequestInterceptor {

    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("X-Api-Key")
        if (apiKey == null) {
            throw UnauthorizedException()
        }

        if (!apiKeyRepository.existsById(apiKey)){
            throw UnauthorizedException()
        }
        // valid
    }

    override fun postHandle(request: WebRequest, model: ModelMap?) {
        // nothing
    }

    override fun afterCompletion(request: WebRequest, ex: Exception?) {
        // nothing
    }
}
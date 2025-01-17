package com.hiday.kotlin_restful_api.service

import com.hiday.kotlin_restful_api.model.CreateProductRequest
import com.hiday.kotlin_restful_api.model.ListProductRequest
import com.hiday.kotlin_restful_api.model.ProductResponse
import com.hiday.kotlin_restful_api.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}
package com.hiday.kotlin_restful_api.repository

import com.hiday.kotlin_restful_api.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {

}
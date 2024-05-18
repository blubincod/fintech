package com.zerobase.domain.repository

import com.zerobase.domain.domain.ProductInfo
import com.zerobase.domain.domain.ProductList
import com.zerobase.domain.domain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface ProdListRepository : JpaRepository<ProductList, Long> {
    fun findByProductCode(productCode: String): ProductList?
}
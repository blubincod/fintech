package com.zerobase.domain.repository

import com.zerobase.domain.domain.ProductInfo
import com.zerobase.domain.domain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface ProdInfoRepository : JpaRepository<ProductInfo, Long> {
//    fun findByProductCode(productCode: String): ProductInfo
}
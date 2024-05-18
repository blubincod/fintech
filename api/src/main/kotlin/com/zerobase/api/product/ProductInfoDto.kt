package com.zerobase.api.product

import com.zerobase.domain.domain.ProductInfo

class ProductInfoDto {
    data class ProductInfoInputDto(
            val organizationCode: String,
            val productCode: String,
            val productMaximumInterest: Double,
            val productMinimumInterest: Double,
            val productName: String,
    ) {
        fun toEntity(): ProductInfo =
                ProductInfo(
                        organizationCode, productCode, productName, productMinimumInterest, productMaximumInterest
                )
    }

    data class ProductInfoResponseDto(
            val responseCode: String,
            val responseMessage: String,
    )
}
package com.zerobase.api.product

import com.zerobase.domain.domain.ProductInfo

interface ProductInfoService {
    fun productInfoMain(
            productInfoInputDto: ProductInfoDto.ProductInfoInputDto
    ): ProductInfoDto.ProductInfoResponseDto

    fun getProductInfo(organizationCode : String): ProductInfoDto.ProductInfoResponseDto?

    fun saveProductInfo(
            productInfoInputDto: ProductInfoDto.ProductInfoInputDto
    ): ProductInfo


}
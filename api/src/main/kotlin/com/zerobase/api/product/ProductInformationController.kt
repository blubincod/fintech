package com.zerobase.api.product

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/fintech/v1/product")
internal class ProductInformationController(
        private val productInfoServiceImpl: ProductInfoServiceImpl
) {
    @GetMapping("/{organizationCode}")
    fun getProdInfo(
            @PathVariable organizationCode: String
    ): ResponseEntity<ProductInfoDto.ProductInfoResponseDto> {
        return ResponseEntity.ok(
                productInfoServiceImpl.getProductInfo(organizationCode)
        )
    }

    @PostMapping("/information")
    fun productInformation(
            @RequestBody productInfoDto: ProductInfoDto.ProductInfoInputDto
    ): ResponseEntity<ProductInfoDto.ProductInfoResponseDto> {
        return ResponseEntity.ok(
                productInfoServiceImpl.productInfoMain(productInfoDto)
        )
    }
}
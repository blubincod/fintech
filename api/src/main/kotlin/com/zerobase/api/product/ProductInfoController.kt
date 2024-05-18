package com.zerobase.api.product

import com.zerobase.api.exception.CustomErrorCode
import com.zerobase.api.exception.CustomException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fintech/v1/product")
internal class ProductInfoController (
        private val productInfoServiceImpl: ProductInfoServiceImpl
){
    @GetMapping("/{organizationCode}")
    fun getProdInfo(
            @PathVariable organizationCode: String
    ):ResponseEntity<ProductInfoDto.ProductInfoResponseDto>{
        throw CustomException(CustomErrorCode.RESULT_NOT_FOUND)
    }

    @PostMapping("/information")
    fun productInformation(
            @RequestBody productInfoDto: ProductInfoDto.ProductInfoInputDto
    ): ResponseEntity<ProductInfoDto.ProductInfoResponseDto>{
        return ResponseEntity.ok(
              productInfoServiceImpl.productInfoMain(productInfoDto)
        )
    }
}
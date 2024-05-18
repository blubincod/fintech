package com.zerobase.api.product

import com.zerobase.domain.domain.ProductInfo
import com.zerobase.domain.repository.ProdInfoRepository
import org.springframework.stereotype.Service


@Service
class ProductInfoServiceImpl(
        private val productInfoRepository: ProdInfoRepository
) : ProductInfoService {
    override fun productInfoMain(
            productInfoInputDto: ProductInfoDto.ProductInfoInputDto
    ): ProductInfoDto.ProductInfoResponseDto {
        saveProductInfo(productInfoInputDto)

        return ProductInfoDto.ProductInfoResponseDto("00", "success")
    }

    override fun saveProductInfo(productInfoInputDto: ProductInfoDto.ProductInfoInputDto) =
            productInfoRepository.save(productInfoInputDto.toEntity())
}

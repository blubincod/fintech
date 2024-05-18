package com.zerobase.api.user

import com.zerobase.api.loan.request.UserInfoDto

class UserInformationDto {
    data class LoanRequestInputDto(
        val userName: String,
        val userIncomeAmount: Long,
        var userRegistrationNumber: String
    ) {
        fun toUserInfoDto(userKey: String) =
            UserInfoDto(
                userKey, userName, userRegistrationNumber, userIncomeAmount
            )
    }

    data class LoanRequestResponseDto(
        val userKey: String
    )
}
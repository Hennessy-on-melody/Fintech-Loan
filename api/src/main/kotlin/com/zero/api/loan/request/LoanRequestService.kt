package com.zero.api.loan.request

import com.zero.domain.domain.UserInfo

interface LoanRequestService {
    fun loanRequestMain(
        loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto
    fun saveUserInfo(
        userInfoDto: UserInfoDto
        ): UserInfo
    fun loanRequestReview(userKey: String)
}
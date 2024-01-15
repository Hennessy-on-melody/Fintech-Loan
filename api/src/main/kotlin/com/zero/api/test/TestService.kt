package com.zero.api.test

import com.zero.domain.domain.UserInfo
import com.zero.domain.repository.UserInfoRepository
import org.springframework.stereotype.Service


@Service
class TestService (
    private val userInfoRepository: UserInfoRepository
){
    fun testGetService(userKey: String) = userInfoRepository.findByUserKey(userKey).toDto()

    fun UserInfo.toDto() = TestDto.UserInfoDto(userKey, userRegistrationNumber, userName, userIncomeAmount)
}
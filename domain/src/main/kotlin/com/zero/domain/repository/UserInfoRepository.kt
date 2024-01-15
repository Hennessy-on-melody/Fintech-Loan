package com.zero.domain.repository

import com.zero.domain.domain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserInfoRepository : JpaRepository<UserInfo, Long>{
    fun findByUserKey(userKey: String): UserInfo
}
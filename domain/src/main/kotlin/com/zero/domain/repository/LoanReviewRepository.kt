package com.zero.domain.repository

import com.zero.domain.domain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository

interface LoanReviewRepository : JpaRepository<LoanReview, Long>
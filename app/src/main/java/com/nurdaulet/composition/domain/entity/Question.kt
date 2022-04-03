package com.nurdaulet.composition.domain.entity

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val answerOptions: List<Int>
) {
    val rightAnswer: Int
        get() = sum - visibleNumber
}
package com.nurdaulet.composition.domain.entity

data class GameResults (
    val isWinner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        )
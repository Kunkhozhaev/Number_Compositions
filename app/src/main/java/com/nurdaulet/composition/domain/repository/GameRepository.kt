package com.nurdaulet.composition.domain.repository

import com.nurdaulet.composition.domain.entity.GameSettings
import com.nurdaulet.composition.domain.entity.Level
import com.nurdaulet.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings

}
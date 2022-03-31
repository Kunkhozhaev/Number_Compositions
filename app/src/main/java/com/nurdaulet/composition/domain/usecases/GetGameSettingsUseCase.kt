package com.nurdaulet.composition.domain.usecases

import com.nurdaulet.composition.domain.entity.GameSettings
import com.nurdaulet.composition.domain.entity.Level
import com.nurdaulet.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level:Level) : GameSettings {
        return repository.getGameSettings(level)
    }
}
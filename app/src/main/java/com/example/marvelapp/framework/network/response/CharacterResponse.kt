package com.example.marvelapp.framework.network.response

import com.barrionuevo.core.domain.model.Character

data class CharacterResponse(
    val id: String,
    val name: String,
    val thumbnail: ThumbnailResponse
)

fun CharacterResponse.toCharacterModel():Character{
    return Character(
        this.name,
        "${this.thumbnail.path}.${this.thumbnail.extension}"
    )
}

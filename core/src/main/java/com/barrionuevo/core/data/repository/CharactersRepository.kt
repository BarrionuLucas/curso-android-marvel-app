package com.barrionuevo.core.data.repository

import androidx.paging.PagingSource
import com.barrionuevo.core.domain.model.Character

interface CharactersRepository {
    fun getCharacters(query: String):PagingSource<Int, Character>
}
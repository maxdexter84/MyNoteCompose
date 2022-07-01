package ru.maxdexter.mynotecompose.domain.interactors

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.model.DomainNote


interface SearchNoteInteractor {
    fun searchNote(searchQuery: String): Flow<List<DomainNote>>
}
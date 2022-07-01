package ru.maxdexter.mynotecompose.domain.interactors

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.model.DomainNote

interface GetNoteInteractor {
    fun getSelectedNote(id: Int): Flow<DomainNote>
    fun getAllNotes(): Flow<List<DomainNote>>
}
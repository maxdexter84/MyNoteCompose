package ru.maxdexter.mynotecompose.domain.interactors

import ru.maxdexter.mynotecompose.domain.model.DomainNote

interface InsertNoteInteractor {
    suspend fun insertNote(note: DomainNote)
}
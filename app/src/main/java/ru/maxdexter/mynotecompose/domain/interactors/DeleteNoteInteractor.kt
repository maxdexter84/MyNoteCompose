package ru.maxdexter.mynotecompose.domain.interactors

import ru.maxdexter.mynotecompose.domain.model.DomainNote

interface DeleteNoteInteractor {
    suspend fun deleteNote(note: DomainNote)
    suspend fun deleteAllNote()
}
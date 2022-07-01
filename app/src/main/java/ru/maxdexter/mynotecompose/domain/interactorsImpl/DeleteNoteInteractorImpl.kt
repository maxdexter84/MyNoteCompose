package ru.maxdexter.mynotecompose.domain.interactorsImpl

import ru.maxdexter.mynotecompose.domain.interactors.DeleteNoteInteractor
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteInteractorImpl @Inject constructor(private val repository: NoteRepository) :
    DeleteNoteInteractor {
    override suspend fun deleteNote(note: DomainNote) {
        repository.deleteNote(note)
    }

    override suspend fun deleteAllNote() {
        repository.deleteAllNote()
    }
}
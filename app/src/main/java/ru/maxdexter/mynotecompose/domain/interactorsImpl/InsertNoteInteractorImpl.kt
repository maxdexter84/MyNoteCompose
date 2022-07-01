package ru.maxdexter.mynotecompose.domain.interactorsImpl

import ru.maxdexter.mynotecompose.domain.interactors.InsertNoteInteractor
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class InsertNoteInteractorImpl @Inject constructor(private val repository: NoteRepository) :
    InsertNoteInteractor {
    override suspend fun insertNote(note: DomainNote) {
        repository.addNote(note)
    }
}
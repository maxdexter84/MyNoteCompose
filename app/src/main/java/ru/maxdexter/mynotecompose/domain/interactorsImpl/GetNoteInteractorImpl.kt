package ru.maxdexter.mynotecompose.domain.interactorsImpl

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.interactors.GetNoteInteractor
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteInteractorImpl @Inject constructor(private val repository: NoteRepository): GetNoteInteractor {
    override fun getSelectedNote(id: Int): Flow<DomainNote> {
       return repository.getSelectedNote(id)
    }

    override fun getAllNotes(): Flow<List<DomainNote>> {
        return repository.getAllNotes
    }
}
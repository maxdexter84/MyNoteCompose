package ru.maxdexter.mynotecompose.domain.interactorsImpl

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.interactors.SearchNoteInteractor
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class SearchNoteInteractorImpl @Inject constructor(private val repository: NoteRepository) :
    SearchNoteInteractor {
    override fun searchNote(searchQuery: String): Flow<List<DomainNote>> {
        return repository.searchDatabase(searchQuery)
    }
}
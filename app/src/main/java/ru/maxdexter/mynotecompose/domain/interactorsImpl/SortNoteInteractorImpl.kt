package ru.maxdexter.mynotecompose.domain.interactorsImpl

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.interactors.SortNotesInteractor
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class SortNoteInteractorImpl @Inject constructor(private val repository: NoteRepository) :
    SortNotesInteractor {
    override fun sortByLowPriority(): Flow<List<DomainNote>> {
        return repository.sortByLowPriority
    }

    override fun sortByHighPriority(): Flow<List<DomainNote>> {
        return repository.sortByHighPriority
    }

}
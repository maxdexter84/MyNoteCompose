package ru.maxdexter.mynotecompose.domain.interactors

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.model.DomainNote

interface SortNotesInteractor {

    fun sortByLowPriority(): Flow<List<DomainNote>>
    fun sortByHighPriority(): Flow<List<DomainNote>>
}
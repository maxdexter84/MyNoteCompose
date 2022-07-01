package ru.maxdexter.mynotecompose.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.mynotecompose.domain.model.DomainNote

interface NoteRepository {
    val getAllNotes: Flow<List<DomainNote>>
    val sortByLowPriority: Flow<List<DomainNote>>
    val sortByHighPriority: Flow<List<DomainNote>>

    fun getSelectedNote(noteId: Int): Flow<DomainNote>

    suspend fun addNote(note: DomainNote)

    suspend fun deleteNote(note: DomainNote)

    suspend fun deleteAllNote()

    fun searchDatabase(searchQuery: String): Flow<List<DomainNote>>
}
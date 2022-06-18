package ru.maxdexter.mynotecompose.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import ru.maxdexter.mynotecompose.data.local.database.NoteDao
import ru.maxdexter.mynotecompose.data.local.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val dao: NoteDao) {

    val getAllNotes: Flow<List<Note>> = dao.getAllNotes().flowOn(Dispatchers.IO)
    val sortByLowPriority: Flow<List<Note>> = dao.sortByLowPriority().flowOn(Dispatchers.IO)
    val sortByHighPriority: Flow<List<Note>> = dao.sortByHIGHPriority().flowOn(Dispatchers.IO)

    fun getSelectedNote(noteId: Int): Flow<Note> {
        return dao.getSelectedNote(noteId).flowOn(Dispatchers.IO)
    }

    suspend fun addNote(note: Note) {
        withContext(Dispatchers.IO) {
            dao.insertNote(note)
        }
    }

    suspend fun deleteNote(note: Note) {
        withContext(Dispatchers.IO) {
            dao.deleteNote(note)
        }
    }

    suspend fun deleteAllNote() {
        withContext(Dispatchers.IO) {
            dao.deleteAllNote()
        }
    }

    fun searchDatabase(searchQuery: String): Flow<List<Note>> {
        return dao.searchInDatabase(searchQuery).flowOn(Dispatchers.IO)
    }

}
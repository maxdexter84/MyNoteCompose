package ru.maxdexter.mynotecompose.data.repository

import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import ru.maxdexter.mynotecompose.data.local.database.NoteDao
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import ru.maxdexter.mynotecompose.util.map.mapToDomainNote
import ru.maxdexter.mynotecompose.util.map.mapToNote
import javax.inject.Inject

@ViewModelScoped
class NoteRepositoryImpl @Inject constructor(
    private val dao: NoteDao,
    private val dispatcher: CoroutineDispatcher
) : NoteRepository {

    override val getAllNotes: Flow<List<DomainNote>> =
        dao.getAllNotes().map { list -> list.map { it.mapToDomainNote() } }.flowOn(dispatcher)
    override val sortByLowPriority: Flow<List<DomainNote>> =
        dao.sortByLowPriority().map { list -> list.map { it.mapToDomainNote() } }.flowOn(dispatcher)
    override val sortByHighPriority: Flow<List<DomainNote>> =
        dao.sortByHIGHPriority().map { list -> list.map { it.mapToDomainNote() } }
            .flowOn(dispatcher)

    override fun getSelectedNote(noteId: Int): Flow<DomainNote> {
        return dao.getSelectedNote(noteId).flowOn(Dispatchers.IO).map { it.mapToDomainNote() }
    }

    override suspend fun addNote(note: DomainNote) {
        withContext(dispatcher) {
            dao.insertNote(note.mapToNote())
        }
    }

    override suspend fun deleteNote(note: DomainNote) {
        withContext(dispatcher) {
            dao.deleteNote(note.mapToNote())
        }
    }

    override suspend fun deleteAllNote() {
        withContext(dispatcher) {
            dao.deleteAllNote()
        }
    }

    override fun searchDatabase(searchQuery: String): Flow<List<DomainNote>> {
        return dao.searchInDatabase(searchQuery).map { list -> list.map { it.mapToDomainNote() } }
            .flowOn(dispatcher)
    }

}
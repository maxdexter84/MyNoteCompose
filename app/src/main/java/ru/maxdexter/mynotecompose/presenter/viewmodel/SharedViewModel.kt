package ru.maxdexter.mynotecompose.presenter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import ru.maxdexter.mynotecompose.domain.interactors.GetNoteInteractor
import ru.maxdexter.mynotecompose.presenter.model.UINote
import ru.maxdexter.mynotecompose.util.map.mapToUINote
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(private val getNoteInteractor: GetNoteInteractor) :
    ViewModel() {

    private val _allNote = MutableStateFlow<List<UINote>>(emptyList())
    val allNote = _allNote.asStateFlow()

    fun getAllNote() {
        viewModelScope.launch {
            getNoteInteractor.getAllNotes().collect { list ->
                _allNote.value = list.map { it.mapToUINote() }
            }
        }
    }
}
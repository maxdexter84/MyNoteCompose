package ru.maxdexter.mynotecompose.util.map

import ru.maxdexter.mynotecompose.data.local.model.Note
import ru.maxdexter.mynotecompose.domain.model.DomainNote
import ru.maxdexter.mynotecompose.presenter.model.UINote

fun Note.mapToDomainNote(): DomainNote {
    return DomainNote(id, title, description, priority)
}

fun DomainNote.mapToNote(): Note {
    return Note(id, title, description, priority)
}

fun DomainNote.mapToUINote(): UINote {
    return UINote(id, title, description, priority)
}
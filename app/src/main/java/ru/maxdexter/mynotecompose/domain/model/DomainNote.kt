package ru.maxdexter.mynotecompose.domain.model

class DomainNote(
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
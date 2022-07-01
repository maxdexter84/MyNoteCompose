package ru.maxdexter.mynotecompose.presenter.model

import ru.maxdexter.mynotecompose.domain.model.Priority

data class UINote(val id: Int = 0,
                  val title: String,
                  val description: String,
                  val priority: Priority
)

package ru.maxdexter.mynotecompose.domain.model


import androidx.compose.ui.graphics.Color
import ru.maxdexter.mynotecompose.ui.theme.HighPriority
import ru.maxdexter.mynotecompose.ui.theme.LowPriority
import ru.maxdexter.mynotecompose.ui.theme.MediumPriority
import ru.maxdexter.mynotecompose.ui.theme.NonePriority


enum class Priority(val color: Color) {
    HIGH(HighPriority),
    MEDIUM(MediumPriority),
    LOW(LowPriority),
    NONE(NonePriority)
}
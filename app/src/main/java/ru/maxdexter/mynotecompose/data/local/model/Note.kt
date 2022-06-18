package ru.maxdexter.mynotecompose.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.maxdexter.mynotecompose.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)

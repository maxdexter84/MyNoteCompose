package ru.maxdexter.mynotecompose.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.maxdexter.mynotecompose.data.local.database.NoteDatabase
import ru.maxdexter.mynotecompose.util.Constants.DATABASE_NAME
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext
        context: Context
    ) = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        DATABASE_NAME
    )
        .build()

    @Singleton
    @Provides
    fun provideDao(database: NoteDatabase) = database.getNoteDao()
}
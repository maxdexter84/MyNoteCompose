package ru.maxdexter.mynotecompose.di

import dagger.Binds
import dagger.Module
import ru.maxdexter.mynotecompose.data.repository.NoteRepositoryImpl
import ru.maxdexter.mynotecompose.domain.repository.NoteRepository
import javax.inject.Singleton

@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindsRepository(repository: NoteRepositoryImpl): NoteRepository
}
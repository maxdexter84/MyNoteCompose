package ru.maxdexter.mynotecompose.di

import dagger.Binds
import dagger.Module
import ru.maxdexter.mynotecompose.domain.interactors.*
import ru.maxdexter.mynotecompose.domain.interactorsImpl.*

@Module
abstract class InteractorsModule {

    @Binds
    abstract fun bindsDeleteNoteInteractor(interactor: DeleteNoteInteractorImpl): DeleteNoteInteractor

    @Binds
    abstract fun bindsGetNoteInteractor(interactor: GetNoteInteractorImpl): GetNoteInteractor

    @Binds
    abstract fun bindsInsertInteractor(interactor: InsertNoteInteractorImpl): InsertNoteInteractor

    @Binds
    abstract fun bindsSearchNoteInteractor(interactor: SearchNoteInteractorImpl): SearchNoteInteractor

    @Binds
    abstract fun bindsSortNoteInteractor(interactor: SortNoteInteractorImpl): SortNotesInteractor

}
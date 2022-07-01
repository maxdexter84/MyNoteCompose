package ru.maxdexter.mynotecompose.di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
class UtilModule {

    @Singleton
    @Provides
    fun provideDispatcher() = Dispatchers.IO
}
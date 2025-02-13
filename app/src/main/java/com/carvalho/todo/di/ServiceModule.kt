package com.carvalho.todo.di

import com.carvalho.todo.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module //
@InstallIn(SingletonComponent::class) //
object ServiceModule {

    @Provides // Retorna a dependência que vai ser utilizada
    @Singleton //
    fun providerRepository(): Repository{
        return Repository()
    }
}
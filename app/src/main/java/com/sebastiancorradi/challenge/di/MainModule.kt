package com.sebastiancorradi.challenge.di

import com.sebastiancorradi.challenge.datasource.DataSource
import com.sebastiancorradi.challenge.datasource.IDataSource
import com.sebastiancorradi.challenge.datasource.repository.db.DBRepository
import com.sebastiancorradi.challenge.datasource.repository.db.IDBRepository
import com.sebastiancorradi.challenge.datasource.repository.local.ILocalRepository
import com.sebastiancorradi.challenge.datasource.repository.local.LocalRepository
import com.sebastiancorradi.challenge.datasource.repository.remote.IRemoteRepository
import com.sebastiancorradi.challenge.datasource.repository.remote.RemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    fun providesCatLocalRepository(): ILocalRepository = LocalRepository()

    @Provides
    fun providesRemoteRepository(): IRemoteRepository = RemoteRepository()

    @Provides
    fun providesCatDBRepository(): IDBRepository = DBRepository()


    fun providesDataSource(catRemoteRepository: IRemoteRepository,
                              catLocalRepository: ILocalRepository,
                              catDBRepository: IDBRepository): IDataSource =

        DataSource(catRemoteRepository, catLocalRepository, catDBRepository)

}





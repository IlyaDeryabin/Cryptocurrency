package ru.d3rvich.cryptocurrency.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.d3rvich.cryptocurrency.data.api.CoinPaprikaApi
import ru.d3rvich.cryptocurrency.data.repository.CoinRepositoryImpl
import ru.d3rvich.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideRepository(coinPaprikaApi: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(coinPaprikaApi)
    }
}
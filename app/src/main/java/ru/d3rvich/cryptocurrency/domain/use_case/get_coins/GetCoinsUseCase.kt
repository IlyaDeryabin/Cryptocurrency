package ru.d3rvich.cryptocurrency.domain.use_case.get_coins

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import ru.d3rvich.cryptocurrency.common.Resource
import ru.d3rvich.cryptocurrency.data.mappers.toCoinEntity
import ru.d3rvich.cryptocurrency.domain.entity.CoinEntity
import ru.d3rvich.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(private val repository: CoinRepository) {
    operator fun invoke(): Flow<Resource<List<CoinEntity>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoinEntity() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<CoinEntity>>(e.localizedMessage ?: "An unexpected error occurred."))
        } catch (e: IOException) {
            emit(Resource.Error<List<CoinEntity>>("Couldn't reach server. Check your internet connection."))
        }
    }
}
package ru.d3rvich.cryptocurrency.data.mappers

import ru.d3rvich.cryptocurrency.data.api.dto.CoinDetailDto
import ru.d3rvich.cryptocurrency.data.api.dto.CoinDto
import ru.d3rvich.cryptocurrency.domain.entity.CoinEntity
import ru.d3rvich.cryptocurrency.domain.entity.CoinDetailEntity

fun CoinDetailDto.toCoinDetailEntity(): CoinDetailEntity = CoinDetailEntity(
    id = id,
    name = name,
    symbol = symbol,
    rank = rank,
    isNew = isNew,
    isActive = isActive,
    description = description,
    tags = tags,
    team = team
)

fun CoinDto.toCoinEntity(): CoinEntity = CoinEntity(
    id = id,
    name = name,
    symbol = symbol,
    rank = rank,
    isNew = isNew,
    isActive = isActive
)
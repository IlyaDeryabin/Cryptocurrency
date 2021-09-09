package ru.d3rvich.cryptocurrency.domain.entity

data class CoinEntity(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val isNew: Boolean,
    val isActive: Boolean
)

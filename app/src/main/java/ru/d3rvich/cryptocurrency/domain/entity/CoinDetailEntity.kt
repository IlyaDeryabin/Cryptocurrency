package ru.d3rvich.cryptocurrency.domain.entity

import ru.d3rvich.cryptocurrency.data.api.dto.TeamMember

data class CoinDetailEntity(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val isNew: Boolean,
    val isActive: Boolean,
    val description: String,
    val tags: List<String>,
    val team: List<TeamMember>
)

package ru.d3rvich.cryptocurrency.data.api.dto

import com.google.gson.annotations.SerializedName

data class CoinDetailDto(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("is_active")
    val isActive: Boolean,
    val description: String,
    val tags: List<String>,
    val team: List<TeamMember>
)

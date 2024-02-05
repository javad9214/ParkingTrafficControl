package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.PlateNumberEntity

data class PlateNumber(
    val id: Long , // Auto-incremented starting from 1001
    val firstSection: String,
    val characterSection: String,
    val secondSection: String,
    val iranNumSection: String

){
    fun toEntity(): PlateNumberEntity {
        return PlateNumberEntity(id, firstSection, characterSection, secondSection, iranNumSection)
    }

    fun PlateNumberEntity.toPlateNumber(): PlateNumber {
        return PlateNumber(id, firstSection, characterSection, secondSection, iranNumSection)
    }
}

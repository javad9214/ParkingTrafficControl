package com.example.parkingtrafficcontrol.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "plateNumberId")
data class PlateNumberEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 1001, // Auto-incremented starting from 1001
    val firstSection: String,
    val characterSection: String,
    val secondSection: String,
    val iranNumSection: String
)

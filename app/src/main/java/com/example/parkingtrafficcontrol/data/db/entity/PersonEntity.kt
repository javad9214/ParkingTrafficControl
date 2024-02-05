package com.example.parkingtrafficcontrol.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
data class PersonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 1001, // Auto-incremented starting from 1001
    val name: String,
)

package com.example.parkingtrafficcontrol.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trafficRecord")
data class TrafficRecordEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 1001, // Auto-incremented starting from 1001
    val personId : Long,
    val date: String,
    val enterTime: String,
    val exitTime: String
)

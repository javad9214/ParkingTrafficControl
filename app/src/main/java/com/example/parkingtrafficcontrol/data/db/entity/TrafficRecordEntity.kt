package com.example.parkingtrafficcontrol.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(tableName = "trafficRecord")
data class TrafficRecordEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 1001, // Auto-incremented starting from 1001
    @Relation(
        parentColumn = "id",
        entityColumn = "personId"
    )
    val personEntity: PersonEntity,
    val date: String,
    val enterTime: String,
    val exitTime: String
)

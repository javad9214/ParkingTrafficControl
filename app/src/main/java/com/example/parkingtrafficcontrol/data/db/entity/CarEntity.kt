package com.example.parkingtrafficcontrol.data.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(
    tableName = "car",
    foreignKeys = [ForeignKey(
        entity = PersonEntity::class,
        parentColumns = ["id"],
        childColumns = ["personId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class CarEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 1001, // Auto-incremented starting from 1001
    val name: String,
    @Relation(
        parentColumn = "id",
        entityColumn = "carId"
    )
    val plateNumberEntity: PlateNumberEntity,
    val personId: Long
)

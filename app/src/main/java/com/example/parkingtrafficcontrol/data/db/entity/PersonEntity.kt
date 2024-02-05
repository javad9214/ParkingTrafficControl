package com.example.parkingtrafficcontrol.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(tableName = "person")
data class PersonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 1001, // Auto-incremented starting from 1001
    val name: String,
    @Relation(
        parentColumn = "id",
        entityColumn = "personId"
    )
    val companyEntity: CompanyEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "personId"
    )
    val carEntityList: List<CarEntity>
)

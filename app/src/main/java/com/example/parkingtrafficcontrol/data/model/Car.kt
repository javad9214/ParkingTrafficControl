package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.CarEntity
import com.example.parkingtrafficcontrol.data.db.entity.PlateNumberEntity

data class Car(
    val id: Long, // Auto-incremented starting from 1001
    val name: String,
    val plateNumberEntity: PlateNumberEntity,
    val personId: Long
){
    fun toEntity(): CarEntity {
        return CarEntity(id, name, plateNumberId, personId)
    }

    fun CarEntity.toCar(): Car {
        return Car(id, name, plateNumberId, personId)
    }
}



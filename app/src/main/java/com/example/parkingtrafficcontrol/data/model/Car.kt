package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.CarEntity

data class Car(
    val id: Long, // Auto-incremented starting from 1001
    val name: String,
    val plateNumberId: Long
){
    fun toEntity(): CarEntity {
        return CarEntity(id, name, plateNumberId)
    }

    fun CarEntity.toCar(): Car {
        return Car(id, name, plateNumberId)
    }
}



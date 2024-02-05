package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.CarEntity

data class Car(
    val id: Long, // Auto-incremented starting from 1001
    val name: String,
){
    fun toEntity(): CarEntity {
        return CarEntity(id, name)
    }

    fun CarEntity.toCar(): Car {
        return Car(id, name)
    }
}



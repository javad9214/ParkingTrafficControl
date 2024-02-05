package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.PersonEntity

data class Person(
    val id: Long, // Auto-incremented starting from 1001
    val name: String,
) {
    fun toEntity(): PersonEntity {
        return PersonEntity(id, name)
    }

    fun PersonEntity.toProduct(): Person {
        return Person(id, name)
    }
}

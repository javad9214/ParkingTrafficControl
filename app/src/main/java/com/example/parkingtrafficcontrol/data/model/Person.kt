package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.PersonEntity

data class Person(
    val id: Long, // Auto-incremented starting from 1001
    val name: String,
    val companyId: Long,
    val carIdList: List<Long>
) {
    fun toEntity(): PersonEntity {
        return PersonEntity(id, name, companyId, carIdList)
    }

    fun PersonEntity.toPerson(): Person {
        return Person(id, name, companyId, carIdList)
    }
}

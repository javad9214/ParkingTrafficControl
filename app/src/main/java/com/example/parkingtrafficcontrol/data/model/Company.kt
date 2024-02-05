package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.CompanyEntity

data class Company(
    val id: Long, // Auto-incremented starting from 1001
    val name: String,
){
    fun toEntity(): CompanyEntity {
        return CompanyEntity(id, name)
    }

    fun CompanyEntity.toCompany(): Company {
        return Company(id, name)
    }
}

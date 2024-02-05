package com.example.parkingtrafficcontrol.data.model

import com.example.parkingtrafficcontrol.data.db.entity.TrafficRecordEntity

data class TrafficRecord(
    val id: Long, // Auto-incremented starting from 1001
    val personId: Long,
    val date: String
){
    fun toEntity(): TrafficRecordEntity {
        return TrafficRecordEntity(id, personId, date)
    }

    fun TrafficRecordEntity.toTrafficRecord(): TrafficRecord {
        return TrafficRecord(id, personId, date)
    }
}

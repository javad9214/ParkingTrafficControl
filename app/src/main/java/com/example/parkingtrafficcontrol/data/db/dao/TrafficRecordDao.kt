package com.example.parkingtrafficcontrol.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parkingtrafficcontrol.data.db.entity.TrafficRecordEntity

@Dao
interface TrafficRecordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTrafficRecord(trafficRecordEntity: TrafficRecordEntity)

    @Query("SELECT * FROM trafficRecord")
    suspend fun getTrafficRecords(): List<TrafficRecordEntity>

}
package com.example.parkingtrafficcontrol.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parkingtrafficcontrol.data.db.entity.CarEntity
import com.example.parkingtrafficcontrol.data.db.entity.PlateNumberEntity

@Dao
interface CarDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCar(car: CarEntity)

    @Query("SELECT * FROM car")
    suspend fun getCars(): List<CarEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlateNumber(plateNumberEntity: PlateNumberEntity)

    @Query("SELECT * FROM plateNumberId")
    suspend fun getPlateNumbers(): List<PlateNumberEntity>



}
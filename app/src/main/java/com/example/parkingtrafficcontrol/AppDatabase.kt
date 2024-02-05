package com.example.parkingtrafficcontrol

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.parkingtrafficcontrol.data.db.dao.CarDao
import com.example.parkingtrafficcontrol.data.db.dao.CompanyDao
import com.example.parkingtrafficcontrol.data.db.dao.PersonDao
import com.example.parkingtrafficcontrol.data.db.dao.TrafficRecordDao
import com.example.parkingtrafficcontrol.data.db.entity.CarEntity
import com.example.parkingtrafficcontrol.data.db.entity.CompanyEntity
import com.example.parkingtrafficcontrol.data.db.entity.PersonEntity
import com.example.parkingtrafficcontrol.data.db.entity.TrafficRecordEntity

@Database(
    entities = [PersonEntity::class, CompanyEntity::class, CarEntity::class, TrafficRecordEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun personDao(): PersonDao
    abstract fun companyDao(): CompanyDao
    abstract fun carDao(): CarDao
    abstract fun trafficRecordDao(): TrafficRecordDao

}
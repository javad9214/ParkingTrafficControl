package com.example.parkingtrafficcontrol.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parkingtrafficcontrol.data.db.entity.CompanyEntity

@Dao
interface CompanyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompany(company: CompanyEntity)

    @Query("SELECT * FROM company")
    suspend fun getCompanies(): List<CompanyEntity>
}
package com.example.parkingtrafficcontrol.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parkingtrafficcontrol.data.db.entity.PersonEntity

@Dao
interface PersonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPerson(personEntity: PersonEntity)

    @Query("SELECT * FROM Person")
    suspend fun getPersons(): List<PersonEntity>
}
package com.example.parkingtrafficcontrol.repository

import com.example.parkingtrafficcontrol.data.db.entity.CarEntity
import com.example.parkingtrafficcontrol.data.db.entity.CompanyEntity
import com.example.parkingtrafficcontrol.data.db.entity.PersonEntity
import com.example.parkingtrafficcontrol.data.db.entity.TrafficRecordEntity

interface MainRepository {

    suspend fun insertPerson(personEntity: PersonEntity)
    suspend fun getAllPersons():List<PersonEntity>

    suspend fun insertCompany(companyEntity: CompanyEntity)
    suspend fun getAllCompanies(): List<CompanyEntity>

    suspend fun insertCar(carEntity: CarEntity)
    suspend fun getAllCars():List<CarEntity>

    suspend fun insertTrafficRecord(trafficRecordEntity: TrafficRecordEntity)
    suspend fun getAllTrafficRecord():List<TrafficRecordEntity>
}
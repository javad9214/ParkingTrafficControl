package com.example.parkingtrafficcontrol.repository

import com.example.parkingtrafficcontrol.data.db.dao.CarDao
import com.example.parkingtrafficcontrol.data.db.dao.CompanyDao
import com.example.parkingtrafficcontrol.data.db.dao.PersonDao
import com.example.parkingtrafficcontrol.data.db.dao.TrafficRecordDao
import com.example.parkingtrafficcontrol.data.db.entity.CarEntity
import com.example.parkingtrafficcontrol.data.db.entity.CompanyEntity
import com.example.parkingtrafficcontrol.data.db.entity.PersonEntity
import com.example.parkingtrafficcontrol.data.db.entity.TrafficRecordEntity

class MainRepoImpl(
    private val personDao: PersonDao,
    private val companyDao: CompanyDao,
    private val carDao: CarDao,
    private val trafficRecordDao: TrafficRecordDao
) : MainRepository {
    override suspend fun insertPerson(personEntity: PersonEntity) {
        return personDao.insertPerson(personEntity)
    }

    override suspend fun getAllPersons(): List<PersonEntity> {
        return personDao.getPersons()
    }

    override suspend fun insertCompany(companyEntity: CompanyEntity) {
        return companyDao.insertCompany(companyEntity)
    }

    override suspend fun getAllCompanies(): List<CompanyEntity> {
        return companyDao.getCompanies()
    }

    override suspend fun insertCar(carEntity: CarEntity) {
        return carDao.insertCar(carEntity)
    }

    override suspend fun getAllCars(): List<CarEntity> {
        return carDao.getCars()
    }

    override suspend fun insertTrafficRecord(trafficRecordEntity: TrafficRecordEntity) {
        return trafficRecordDao.insertTrafficRecord(trafficRecordEntity)
    }

    override suspend fun getAllTrafficRecord(): List<TrafficRecordEntity> {
        return trafficRecordDao.getTrafficRecords()
    }
}
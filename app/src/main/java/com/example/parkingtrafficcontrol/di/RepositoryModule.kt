package com.example.parkingtrafficcontrol.di

import com.example.parkingtrafficcontrol.data.db.dao.CarDao
import com.example.parkingtrafficcontrol.data.db.dao.CompanyDao
import com.example.parkingtrafficcontrol.data.db.dao.PersonDao
import com.example.parkingtrafficcontrol.data.db.dao.TrafficRecordDao
import com.example.parkingtrafficcontrol.repository.MainRepoImpl
import com.example.parkingtrafficcontrol.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        personDao: PersonDao,
        companyDao: CompanyDao,
        carDao: CarDao,
        trafficRecordDao: TrafficRecordDao
    ): MainRepository {
        return MainRepoImpl(
            personDao = personDao,
            companyDao = companyDao,
            carDao = carDao,
            trafficRecordDao = trafficRecordDao
        )
    }

}
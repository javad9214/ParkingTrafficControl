package com.example.parkingtrafficcontrol.di

import com.example.parkingtrafficcontrol.AppDatabase
import com.example.parkingtrafficcontrol.data.db.dao.CarDao
import com.example.parkingtrafficcontrol.data.db.dao.CompanyDao
import com.example.parkingtrafficcontrol.data.db.dao.PersonDao
import com.example.parkingtrafficcontrol.data.db.dao.TrafficRecordDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Singleton
    @Provides
    fun providePersonDao(database: AppDatabase): PersonDao{
        return database.personDao()
    }

    @Singleton
    @Provides
    fun provideCompanyDao(database: AppDatabase): CompanyDao{
        return database.companyDao()
    }

    @Singleton
    @Provides
    fun provideCarDao(database: AppDatabase): CarDao{
        return database.carDao()
    }

    @Singleton
    @Provides
    fun provideTrafficRecord(database: AppDatabase): TrafficRecordDao{
        return database.trafficRecordDao()
    }
}
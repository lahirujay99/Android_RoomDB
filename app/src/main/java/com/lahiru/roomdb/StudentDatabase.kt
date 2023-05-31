package com.lahiru.roomdb


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [StudentsEntity::class], version = 1, exportSchema = false)
abstract class StudentDatabase:RoomDatabase() {

}
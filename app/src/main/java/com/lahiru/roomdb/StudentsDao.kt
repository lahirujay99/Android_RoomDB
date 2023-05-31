package com.lahiru.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StudentsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addStudent(studentsEntity: StudentsEntity)

    @Query("Select * from students_data order by id ASC")
    fun readAllData(): LiveData<List<StudentsEntity>>
}
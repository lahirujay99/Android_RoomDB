package com.lahiru.roomdb

import androidx.lifecycle.LiveData

class StudentRepository(private val studentsDao: StudentsDao) {

    val readAllData : LiveData<List<StudentsEntity>> = studentsDao.readAllData()

    suspend fun addStudent(studentsEntity: StudentsEntity){
        studentsDao.addStudent(studentsEntity)
    }

}
package com.lahiru.roomdb

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StudentViewModel(application: Application):AndroidViewModel(application) {

    private val readAllData : LiveData<List<StudentsEntity>>
    private val repository: StudentRepository

    init{
        val stDao = StudentDatabase.getDatabase(application).stDao()
        repository = StudentRepository(stDao)
        readAllData = repository.readAllData
    }

    fun addStudent(studentsEntity: StudentsEntity){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addStudent(studentsEntity)
        }
    }
}
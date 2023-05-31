package com.lahiru.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students_data")
data class StudentsEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val LastName: String,
    val age: Int

)

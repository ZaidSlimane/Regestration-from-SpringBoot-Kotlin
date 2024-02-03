package com.example.ugelformbackend.Service

import com.example.ugelformbackend.Model.Student
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service

@Configuration
@Service
class FormService {
    final val dataBaseRef : FirebaseDatabase = FirebaseDatabase.getInstance()
    val studentRef : DatabaseReference = dataBaseRef.getReference("/students")

    fun save(student : Student){
        studentRef.child("students").push().setValueAsync(student)
    }



}
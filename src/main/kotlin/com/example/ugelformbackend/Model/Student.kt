package com.example.ugelformbackend.Model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Student(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val email: String = "",

        val firstName: String = "",

        val lastName: String = "",

        val birthdate: String = "",

        val studentNumber: String = "",

        val gender: String = "", // Consider using a different validation mechanism if selecting from predefined options
        val department: String = "", // Consider using a different validation mechanism if selecting from predefined options
        val speciality: String = "",
        val studyYear: String ="", // Consider using a different validation mechanism if selecting from predefined options
        val accommodation: String = "",

        val phoneNumber: String ="", // Consider additional validation for format

        val facebookURL: String="",

        val hobbies: String="",

        val joiningReason: String=""
)



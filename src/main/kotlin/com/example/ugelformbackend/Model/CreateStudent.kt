package com.example.ugelformbackend.Model

class CreateStudent {
    var email: String? = null
    var firstName: String? = null
    var lastName: String? = null
    var birthdate: String? = null
    var studentNumber: String? = null
    var gender: String? = null // Consider using a different validation mechanism if selecting from predefined options
    var department: String? = null // Consider using a different validation mechanism if selecting from predefined options
    var speciality: String? = null
    var studyYear: String? = null // Consider using a different validation mechanism if selecting from predefined options
    var accommodation: String? = null
    var phoneNumber: String? = null // Consider additional validation for format
    var facebookURL: String? = null
    var hobbies: String? = null
    var joiningReason: String? = null
}

package com.example.ugelformbackend.Controller

import com.example.ugelformbackend.Model.CreateStudent
import com.example.ugelformbackend.Model.Student
import com.example.ugelformbackend.Service.FormService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class FormController {

    @Autowired
    lateinit var formService : FormService

    val log : Logger = LoggerFactory.getLogger(FormController::class.java)

    @GetMapping("/register")
    fun getForm(model: Model) : String {
        model.addAttribute("studentForm", CreateStudent())
        return "form"
    }



    @PostMapping("/register")
    fun setStudent (student: Student) : String{
        log.info(">>student : {}", student.toString())
        formService.save(student)
        return "form_test"
    }

}
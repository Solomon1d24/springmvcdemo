package com.solomon.springdemo.Controller;


import com.solomon.springdemo.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showform")
    public String showForm(Model model){
        model.addAttribute("student", new Student());

        return "student-form";
    }

    @RequestMapping("/processform")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println("The Student is " + student.getFirstName() + " " + student.getLastName() + " "  +
                "His nationality is " + student.getCountry() + " " + "His favourite programming language is " + student.getFavouriteLanguage());

        return "student-confirmation";

    }






}

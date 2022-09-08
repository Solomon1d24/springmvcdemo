package com.solomon.springdemo.Controller;

import com.solomon.springdemo.Model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/course")
public class CourseController {

    @RequestMapping("/showform")
    public String showForm(Model model){
        model.addAttribute("course", new Course());
        return "course-form";
    }

    @RequestMapping("/processform")
    public String processForm(@ModelAttribute("course") Course course){

        System.out.println("The course name is " + course.getCourseName() + ". The course code is " + course.getCourseCode());

        return "course-confirmation";
    }

}

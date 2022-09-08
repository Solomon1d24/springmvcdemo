package com.solomon.springdemo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/silly")
public class SillyController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }


    @RequestMapping("/processForm")
    public String processForm(){
        // need a controller method to process the initial HTML form
        return "helloworld";
    }


    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // read the request parameter from the HTML form
        String studentName = request.getParameter("studentName");

        // convert the data to all caps
        studentName = studentName.toUpperCase();

        // create the message
        String result = "Yo! " + studentName;

        // add message to the model

        model.addAttribute("message",result);

        // return helloworld

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hey my friend from version three " + theName;

        // add message to the model

        model.addAttribute("message", result);

        // return helloworld

        return "helloworld";


    }

}

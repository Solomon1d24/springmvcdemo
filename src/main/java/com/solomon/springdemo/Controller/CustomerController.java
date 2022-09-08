package com.solomon.springdemo.Controller;

import com.solomon.springdemo.Model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/customer")
public class CustomerController {

  // add an init-binder ... to convert trim input strings
  // remove leading and trailing whitespace
  // resolve issue for our validation

  @InitBinder
  public void iniBinder(WebDataBinder dataBinder){
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
    dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
  }

  @RequestMapping("/showform")
  public String showForm(Model theModel) {
    theModel.addAttribute("customer", new Customer());
    return "customer-form";
  }

  @PostMapping("/processform")
  public String processForm(@Valid Customer theCustomer, BindingResult theBindingResult) {

    System.out.println(theCustomer.getFirstName() + " " + theCustomer.getLastName());
    System.out.println(theBindingResult);
    System.out.println(theBindingResult.hasErrors());

    if (theBindingResult.hasErrors()) {
      return "customer-form";
    }
    else {
      return "customer-confirmation";
    }
  }
}

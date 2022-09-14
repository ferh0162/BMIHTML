package com.example.bmihtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebFormController {

  @GetMapping("/")
  public String showFrom(){
    return "webform";
  }


}

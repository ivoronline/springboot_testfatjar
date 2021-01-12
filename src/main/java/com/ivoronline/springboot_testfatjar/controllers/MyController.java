package com.ivoronline.springboot_testfatjar.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    return "Message from SpringbootTestfatjar Controller";
  }

}

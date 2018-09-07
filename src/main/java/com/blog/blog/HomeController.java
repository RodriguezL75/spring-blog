package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//
//public class HomeController {
//   @RequestMapping(path = "/landing", method = RequestMethod.GET)
//    @ResponseBody
//    private String lanPg() {
//       return "This is the landing page!";
//   }
//}

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @GetMapping("/hello/{name}")
    public String returnHomePage(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("lisa", "lisa");
        return "home";
    }

}

//@Controller
//public class TestController {
//
//    @RequestMapping(path = "/hi", method = RequestMethod.GET)
//    @ResponseBody
//    private String sayHi() {
//        return "Well hi!";
//    }
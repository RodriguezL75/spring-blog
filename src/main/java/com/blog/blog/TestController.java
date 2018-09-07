package com.blog.blog;


//going to have multiple controllers

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    @ResponseBody
    private String sayHi() {
        return "Well hi!";
    }

    @RequestMapping("/texas/howdy")
    @ResponseBody
    private String sayHowdy() {
        return "Howdy!";
    }

    @GetMapping("/greetings")
    @ResponseBody
    private String greet(){
        return "Greetings";
    }

    //extracting URI path variables
    @RequestMapping("/name/{name}")
    @ResponseBody
    private String sayName(@PathVariable String name){
        return "Your name is: " + name;
    }

    @GetMapping("/favnum/{favnum}/leastfavnum/{leastnum}")
    @ResponseBody
    private String numMessage(
            @PathVariable int favnum,
            @PathVariable int leastnum
    ) {
        String message = "";
        message += "Fav num is: " + favnum;
        message += "<br>";
        message += "Least fav num is; " + leastnum;
        return message;
    }

    @GetMapping("/list")
    private String listOfNames(Model viewModel){

        List<String> names = new ArrayList<>();

        names.add("Lisa");
        names.add("Joseph");
        names.add("Jack");
        names.add("Canyon");

        viewModel.addAttribute("listOfNames", names);
        viewModel.addAttribute("role", "editor");


        return "lists";
    }

}

package com.blog.blog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//public class MathController {
//    @GetMapping(path = "/increment/{number}")
//    @ResponseBody
//    public String addTwo(@PathVariable int number) {
//        return number + " plus three is " + (number + 3) + "!";
//    }
//
//
//}


//public class MathController {
//    @GetMapping(path = "/subtract/{number}")
//    @ResponseBody
//    public String addTwo(@PathVariable int number) {
//        return number + " minus three is " + (number - 3) + "!";
//    }
//
//
//}


//public class MathController {
//    @GetMapping(path = "/multiply/{number}")
//    @ResponseBody
//    public String addTwo(@PathVariable int number) {
//        return number + " multiply four is " + (number) * 4 + "!";
//    }
//
//
//}

public class MathController {
    @GetMapping(path = "/divide/{number}")
    @ResponseBody
    public String divideTwo(@PathVariable int number) {
        return number + " divide three is " + (number) / 3 + "!";
    }


}

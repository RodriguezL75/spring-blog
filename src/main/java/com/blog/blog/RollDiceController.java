//package com.blog.blog;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.Random;
//
//@Controller
//public class RollDiceController {
//
//    public RollDiceController() {
//    }
//
//    @GetMapping("/roll-dice/{guess}")
//    public String rollDice(@PathVariable int guess, Model model){
//        model.addAttribute("guess", guess);
//        Random num = new Random();
//        int n = num.nextInt(6)+1;
//        model.addAttribute("n", String.valueOf(n));
//        return "rollDice";
//    }
//    @GetMapping("/roll-dice")
//    public String dice(){
//        return "rollDice";
//    }
//
//}


package com.blog.blog;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;

        import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String returnRollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{num}")
    public String returnResults(@PathVariable int num, Model model) {
        model.addAttribute("answer", generateRandomNum());
        model.addAttribute("userGuess", num);
        return "roll-results";
    }
    private int generateRandomNum() {
        Random random = new Random();
        return random.nextInt((6 - 1) + 1) + 1;
    }
}
package controllers;

import models.Entity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main page");
        return "home";
    }

    @PostMapping("/")
    public String homePost(@RequestParam String Fb50, @RequestParam String Rb50, @RequestParam String Fb50m,
                           @RequestParam String Rb50m, @RequestParam String Fb27, @RequestParam String Rb27,
                           @RequestParam String Fb12, @RequestParam String Rb12, @RequestParam String Fb5,
                           @RequestParam String Rb5, Model model) {
        Entity entity = new Entity(Fb50, Rb50, Fb50m, Rb50m, Fb27, Rb27, Fb12, Rb12, Fb5, Rb5);
        return "redirect:/finish";
    }

    @GetMapping("/finish")
    public String finish(Model model){
        model.addAttribute("title", "Finish page");
        return "finish";
    }

}
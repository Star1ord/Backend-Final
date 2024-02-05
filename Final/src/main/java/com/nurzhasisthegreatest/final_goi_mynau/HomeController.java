package com.nurzhasisthegreatest.final_goi_mynau;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }


//    @GetMapping("/login")
//    public String login(Model model) {
//        model.addAttribute("user", new User());
//        return "login";
    }
//}


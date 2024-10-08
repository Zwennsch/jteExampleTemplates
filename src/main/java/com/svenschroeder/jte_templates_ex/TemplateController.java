package com.svenschroeder.jte_templates_ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("username", "hans");
        return "pages/home";
    }
}

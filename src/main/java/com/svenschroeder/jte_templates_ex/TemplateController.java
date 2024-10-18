package com.svenschroeder.jte_templates_ex;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "Sven");
        return "pages/home";
    }

    @GetMapping("/team")
    public String team(Model model){
        List<String> members = List.of("Alice", "Hans", "Peter", "Dhewie");
        model.addAttribute("teamMembers", members); 
        return "pages/team";
    }

    @GetMapping("projects")
    public String projects(Model model){
        List<String> projects = List.of("P1", "P2", "P3");
        model.addAttribute("username", "Twirney");
        model.addAttribute("projects", projects);
        return "pages/projects";
    }
}

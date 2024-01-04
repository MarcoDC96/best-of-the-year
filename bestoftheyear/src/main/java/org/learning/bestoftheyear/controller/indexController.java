package org.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/year")
public class indexController {
@GetMapping
 public String year(Model model){
    model.addAttribute("Year", 2023);
    model.addAttribute("Name", "Marco");
    return "/year";
}
}

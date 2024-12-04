package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.get.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Company")
public class CompanyHomeController {
    @GetMapping("/Home")
    public String home(){
        return "company/CompanyHome";
    }
}

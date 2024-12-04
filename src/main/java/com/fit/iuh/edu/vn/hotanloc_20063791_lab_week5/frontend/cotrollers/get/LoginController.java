package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class LoginController {

    @GetMapping("/Option")
    public String DangNhapLuaChon(Model model){
        model.addAttribute("Hello", "Hello from the orther side");
        return "/LoginOption";
    }



}

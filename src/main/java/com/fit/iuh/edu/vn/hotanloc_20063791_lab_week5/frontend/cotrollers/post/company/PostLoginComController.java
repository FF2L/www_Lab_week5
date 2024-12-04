package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.post.company;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.UserPassCompany;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class PostLoginComController {
    @Autowired
    private CompanyService companyService;
    @PostMapping("/CompanyHome")
    public String dangNhapCuaCongTy(@ModelAttribute ("userPassCompany")UserPassCompany userPassCompany){
        String phanHoi = companyService.LoginCompany(userPassCompany);
        if (!phanHoi.equals("Ok"))
            return "redirect:/Login/Company?error="+phanHoi;
        return "redirect:/Company/Home";
    }
}

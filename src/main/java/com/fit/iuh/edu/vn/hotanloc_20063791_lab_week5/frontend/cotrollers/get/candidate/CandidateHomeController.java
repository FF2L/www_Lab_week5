package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.get.candidate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Candidate")
public class CandidateHomeController {

    @GetMapping("/Home")
    public String trangChuCandidate(){
        return "candidate/CandidateHomePage";
    }
}

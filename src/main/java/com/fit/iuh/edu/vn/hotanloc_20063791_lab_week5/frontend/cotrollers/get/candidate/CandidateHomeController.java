package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.get.candidate;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.candidate.CandidateService;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.models.ListJobSkillVaLinkDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Candidate")
public class CandidateHomeController {
    @Autowired
    private CandidateService candidateService;
    @Autowired
    private ListJobSkillVaLinkDetail listJobSkillVaLinkDetail;

    @GetMapping("/Home")
    public String trangChuCandidate(Model model){
        listJobSkillVaLinkDetail.setListJobSkill(candidateService.danhsachJobSkill());
        listJobSkillVaLinkDetail.setLinkDetail("Candidate/JobSkillDetail");
        model.addAttribute("listJobSkillVaLinkDetail",listJobSkillVaLinkDetail );
        return "candidate/CandidateHomePage";
    }

    @GetMapping("/JobSkillDetail")
    public String getJobSkillDetail(){
        return "candidate/JobSkillDetail";
    }
}

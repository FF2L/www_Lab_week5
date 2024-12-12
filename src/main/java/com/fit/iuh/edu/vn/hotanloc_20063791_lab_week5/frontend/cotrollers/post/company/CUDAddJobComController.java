package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.post.company;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Company;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Job;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill_Id;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.JobSkill_Repositories;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.company.CompanyService;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.models.JobSkillvaIdCom;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/Company")
public class CUDAddJobComController {
    @Autowired
    private JobSkill_Repositories jobSkill_repositories;
    @Autowired
    private JobSkill jobSkill;
    @Autowired
    private Job job;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private JobSkillvaIdCom jobSkillvaIdCom;
    @Autowired
    private JobSkill_Id jobSkill_id;
    @Autowired
    private Company company;

    @PostMapping("/SaveJob")
    public String themCongViec(
                               @ModelAttribute(value = "job") Job job,
                               HttpSession session) {

        Long idJob = (Long) session.getAttribute("taoJobId");
        if (idJob == -1){
            return "redirect:/Company/AddJob?error=LoiChuaThemJobSkill";
        }
        company.setId((Long) session.getAttribute("IdCompany"));

        job.setId(idJob);
        job.setCompany(company);

        companyService.themJob(job);
        Long taoJobId = (long) -1;
        session.setAttribute("taoJobId",taoJobId);

        return "redirect:/Company/AddJob";
    }

    @PostMapping("/SaveJobSkill")
    public String saveJobSkill(HttpSession session, @ModelAttribute(value ="ttJob")Job job,
                               @ModelAttribute(value = "jobSkill") JobSkill jobSkill,
                               @RequestParam(value = "ad" ) String ad,
                               RedirectAttributes redirectAttributes) {

        Long taoJobId = (Long) session.getAttribute("taoJobId");
        Long IdCompany = (Long) session.getAttribute("IdCompany");

        Long idJobDaTao = companyService.themJobSkill(taoJobId,IdCompany,jobSkill); //Them xong tra ve id cua job vua tao
        if (idJobDaTao != -1){
            session.setAttribute("taoJobId",idJobDaTao);
        }
        return "redirect:/Company/AddJob?ad="+ad ;

    }
}


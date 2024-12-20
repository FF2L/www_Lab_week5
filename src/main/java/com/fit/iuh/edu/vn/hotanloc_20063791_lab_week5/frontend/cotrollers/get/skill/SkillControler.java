package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers.get.skill;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Skill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.skill.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Skill")
public class SkillControler {
    @Autowired
    private Skill skill;
    @Autowired
    private SkillService skillService;

    @GetMapping("/AddSkill")
    public String addSkill(Model model, @RequestParam(value = "delete",required = false) String id){
        if (id != null){
            Long idSkill =Long.parseLong(id);
            skillService.deleteSkill(idSkill);
        }
        model.addAttribute("skill", skill);
        model.addAttribute("listSkillType",skillService.listSkillType());
        model.addAttribute("listSkill",skillService.listSkill());

        return "Skill/AddSkill";
    }
}

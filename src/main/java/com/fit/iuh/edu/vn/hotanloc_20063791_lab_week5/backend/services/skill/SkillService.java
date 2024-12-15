package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.skill;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.enums.EnumModel;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Skill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.CandidateSkill_Repositories;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.JobSkill_Repositories;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.Skill_Repositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {
    @Autowired
    private Skill skill;
    @Autowired
    Skill_Repositories skill_repositories;
    @Autowired
    CandidateSkill_Repositories candidateSkill_repositories;
    @Autowired
    JobSkill_Repositories jobSkill_repositories;
    public List<Skill> listSkill(){
        return skill_repositories.findAll();
    }

    public List<String> listSkillType(){
        List<String> listSkillType = new ArrayList<>();
        listSkillType.add(EnumModel.SkillType.SOFT_SKILL.toString());
        listSkillType.add(EnumModel.SkillType.UNSPECIFIC.toString());
        listSkillType.add(EnumModel.SkillType.TECHNICAL_SKILL.toString());

        return listSkillType;
    }

    public void saveSkill(Skill skill){
        skill_repositories.save(skill);
    }

    @Transactional
    public void deleteSkill(Long id) {
        candidateSkill_repositories.deleteBySkillId(id);
        jobSkill_repositories.deleteBySkillId(id);
        skill_repositories.deleteById(id);
    }
}

package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.candidate;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.JobSkill_Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private JobSkill jobSkill;
    @Autowired
    private JobSkill_Repositories jobSkill_repositories;

    public List<JobSkill> danhsachJobSkill(){
        return jobSkill_repositories.findAll();
    }
}
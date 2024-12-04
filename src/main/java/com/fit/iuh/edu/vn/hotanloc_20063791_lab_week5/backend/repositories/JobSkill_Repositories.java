package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill_Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSkill_Repositories extends JpaRepository<JobSkill, JobSkill_Id> {
}

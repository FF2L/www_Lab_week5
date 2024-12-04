package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.CandidateSkill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.CandidateSkill_Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateSkill_Repositories extends JpaRepository<CandidateSkill, CandidateSkill_Id> {
}

package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.CandidateSkill;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.ids.CandidateSkill_Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateSkill_Repositories extends JpaRepository<CandidateSkill, CandidateSkill_Id> {

    @Query("SELECT cs FROM CandidateSkill cs WHERE cs.candidate.id = :canId")
    List<CandidateSkill> timCandidateSkillTheoCanId(@Param("canId") Long canId);

    @Modifying
    @Query("DELETE FROM CandidateSkill cs WHERE cs.skill.id = :id")
    void deleteBySkillId(@Param("id") Long id);
}

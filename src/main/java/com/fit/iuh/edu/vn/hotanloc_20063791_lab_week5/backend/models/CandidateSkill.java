package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.enums.EnumModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkill_Id id;
    @Enumerated(EnumType.STRING)
    private EnumModel.SkillLevel skillLevel;
    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @ManyToOne
    @MapsId("canId")
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    private String moreInfo;
}

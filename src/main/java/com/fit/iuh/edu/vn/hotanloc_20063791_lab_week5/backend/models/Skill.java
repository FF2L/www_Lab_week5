package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.enums.EnumModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name ="skill_id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private EnumModel.SkillType type;
    private String skillName;
    private String skillDescription;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

}

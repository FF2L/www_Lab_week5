package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.models;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSkillvaIdCom {
    private JobSkill jobSkill;
    private String id;
}

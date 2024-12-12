package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.models;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.JobSkill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListJobSkillVaLinkDetail {
    private List<JobSkill> listJobSkill;
    private String linkDetail;;
}

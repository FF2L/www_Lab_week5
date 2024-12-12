package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Embeddable
@Data //@Data, Lombok sẽ tự động tạo các phương thức getters, setters, equals(), hashCode() và toString()
@Component
public class CandidateSkill_Id implements Serializable {
    private Long skillId;
    private Long canId;
}

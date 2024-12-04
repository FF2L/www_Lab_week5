package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private Long id;
    private LocalDate toDate;
    private LocalDate fromDate;
    @ManyToOne
    @JoinColumn(name ="can_id",referencedColumnName = "can_id")
    private Candidate candidate;
    private String companyName;
    private String role;
    private String workDescription;
}
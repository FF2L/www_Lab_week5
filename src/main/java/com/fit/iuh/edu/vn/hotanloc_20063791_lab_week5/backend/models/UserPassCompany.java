package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPassCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "com_id")
    private Company company;
    private String userName;
    private String password;

    public UserPassCompany(String userName, Company company, String password) {
        this.userName = userName;
        this.company = company;
        this.password = password;
    }

    public UserPassCompany(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

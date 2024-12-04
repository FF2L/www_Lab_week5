package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import com.neovisionaries.i18n.CountryCode;
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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private Long id;
    private String city;
    @Enumerated(EnumType.STRING)
    private CountryCode country;
    private String zipcode;
    private String street;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
    private Candidate candidate;
    private String number;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
    private Company company;
}
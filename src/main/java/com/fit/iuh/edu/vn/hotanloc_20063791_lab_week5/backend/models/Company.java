package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company  {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "com_id")
    private Long id;
    private String name;
    private String about;
    @OneToOne
    @JoinColumn(name= "address")
    private Address address;
    private String phone;
    private String webURL;
    @OneToMany(mappedBy = "company") // ánh xạ qua class job với tên biến company
    private List<Job> jobs;
    private String email;
    @OneToOne(mappedBy = "company")
    private UserPassCompany userPassCompany;

    public Company(Long id) {
        this.id = id;
    }

    public Company(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

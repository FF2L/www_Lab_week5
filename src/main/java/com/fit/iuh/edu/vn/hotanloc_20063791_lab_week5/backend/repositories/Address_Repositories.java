package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address_Repositories extends JpaRepository<Address,Long> {
}

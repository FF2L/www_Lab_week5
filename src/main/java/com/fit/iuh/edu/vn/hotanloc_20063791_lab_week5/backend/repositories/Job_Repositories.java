package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Job_Repositories extends JpaRepository<Job,Long> {

    @Query("SELECT j FROM Job j WHERE j.name IS NOT NULL AND j.company.id = :idCom")
    List<Job> danhSachTatCaJobKhongCoTen(@Param("idCom") Long idCom);
}

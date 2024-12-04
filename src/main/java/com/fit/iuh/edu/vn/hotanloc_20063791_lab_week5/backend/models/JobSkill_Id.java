package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.SecondaryTable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable //the hien day la mot class chua cac field cua mot class khac va class duoc nhung phai su dung @Embedded va trong co so du lieu se duoc hien thi thanh mot bang va co chua cac field cua class nay
@Data
public class JobSkill_Id implements Serializable {
    private Long jobId;
    private Long skillId;
}

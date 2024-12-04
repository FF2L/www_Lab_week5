package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.services.company;

import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.Company;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.models.UserPassCompany;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.Company_Repositories;
import com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.backend.repositories.UserPassCom_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private Company_Repositories company_repositories;
    @Autowired
    private UserPassCom_Repository userPassCom_repository;
    @Autowired
    private Company company;
    @Autowired
    private Company company2;
    @Autowired
    private UserPassCompany userPassCom;

    public String addCompany(UserPassCompany userPassCompany) {
        company = company_repositories.findByPhone(userPassCompany.getCompany().getPhone());
        company2 = company_repositories.findByEmail(userPassCompany.getCompany().getEmail());
        userPassCom = userPassCom_repository.findByUserName(userPassCompany.getUserName());
        //Kiem tra xem cong ty da co dang ky bang email va sdt chua
        if (company != null || company2 != null) { //Neu 1 trong 2 da co thi tra ve EmailAndPhoneNotOke
            return "EmailAndPhoneNotOke";
        } else if (userPassCom != null) { //Kiem tra xem ten tai khoan da co chua
            return "UserNotOk";
        } else { //Neu chua co thi luu Compnay vao truoc sao do lay id ra set vao UserPassCompany va luu vao databse
            company_repositories.save(userPassCompany.getCompany());
            userPassCompany.setCompany(company_repositories.
                    findByPhoneAndEmail(userPassCompany.getCompany().getPhone(),
                            userPassCompany.getCompany().getEmail()));
            userPassCom_repository.save(userPassCompany);
            return "Ok";
        }
    }

    public String LoginCompany(UserPassCompany userPassCompany) {
        userPassCom = userPassCom_repository
                .findByUserNameAndPassword(userPassCompany.getUserName(), userPassCompany.getPassword());
        if (userPassCom == null)
            return "UserPassNotOk";
        return "Ok";
    }
}

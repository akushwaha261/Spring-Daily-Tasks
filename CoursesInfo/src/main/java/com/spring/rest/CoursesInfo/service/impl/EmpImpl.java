package com.spring.rest.CoursesInfo.service.impl;

import com.spring.rest.CoursesInfo.entity.Emp;
import com.spring.rest.CoursesInfo.repo.EmpRepo;
import com.spring.rest.CoursesInfo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpImpl implements EmpService {

    @Autowired
    EmpRepo empRepo;

    @Override
    public List<Emp> getAllEmp() {
        return empRepo.getEmpList();
    }
}

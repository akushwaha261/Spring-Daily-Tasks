package com.spring.rest.CoursesInfo.service;

import com.spring.rest.CoursesInfo.entity.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService{

    public List<Emp> getAllEmp() throws Exception;
}

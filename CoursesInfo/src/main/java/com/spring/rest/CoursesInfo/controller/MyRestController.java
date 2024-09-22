package com.spring.rest.CoursesInfo.controller;

import com.spring.rest.CoursesInfo.entity.Emp;
import com.spring.rest.CoursesInfo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

//    @Autowired
//    private CourseService courseService;

    @Autowired
    private EmpService empService;

//    @GetMapping("/getCourses")
//    public List<Course> getCourses(){
//        return courseService.getCourses();
//    }

    @GetMapping("/getEmployees")
    public ResponseEntity<?> getAllEmployees() throws Exception {
        List<Emp> getAllEmp = empService.getAllEmp();
        return new ResponseEntity<>(getAllEmp, HttpStatus.OK);
    }

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}

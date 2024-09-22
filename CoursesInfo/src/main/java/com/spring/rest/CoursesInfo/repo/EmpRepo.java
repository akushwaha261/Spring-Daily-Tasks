package com.spring.rest.CoursesInfo.repo;

import com.spring.rest.CoursesInfo.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Long> {
    @Query("SELECT u FROM Emp u")
    List<Emp> getEmpList();
}

package com.api.springboottutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.springboottutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    @Query("Select department from Department department where department.departmentName like %?1")
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}

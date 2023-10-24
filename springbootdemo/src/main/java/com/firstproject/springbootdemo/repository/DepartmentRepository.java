package com.firstproject.springbootdemo.repository;

import com.firstproject.springbootdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department save(Department department);
    public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String departmentName);
    //we have to create a methode to find it that's why we declering methods we don't have to implement it
}

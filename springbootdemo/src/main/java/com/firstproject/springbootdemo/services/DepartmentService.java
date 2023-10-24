package com.firstproject.springbootdemo.services;

import com.firstproject.springbootdemo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public List<Department> fetchDepartment();

    public Department fetchDepartmentbyID(Long deparmentId);

   public void deleteDepartment(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);


   public Department fetchDepartmentByname(String depatmentName);
}

package com.firstproject.springbootdemo.services;

import com.firstproject.springbootdemo.entity.Department;
import com.firstproject.springbootdemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceimp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        //the data is in the repository so we again creating the method and calling the repository to fetch
        return departmentRepository.save(department);
        //api for saving department
    }

    @Override
    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
        //apifor fetching list of department
    }

    @Override
    public Department fetchDepartmentbyID(Long deparmentId) {
        return departmentRepository.findById(deparmentId).get();
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
          Department dbp= departmentRepository.findById(departmentId ).get();
       if(Objects.nonNull(department.getDepartmentId())&&
        !"".equalsIgnoreCase(department.getDepartmentName()))
       {
           dbp.setDepartmentName(department.getDepartmentName());       
       }
       if (Objects.nonNull(department.getDepartmentAddress())&&
               !"".equalsIgnoreCase(department.getDepartmentAddress())) {
           dbp.setDepartmentAddress((department.getDepartmentAddress()));
           
       }
       if(Objects.nonNull(department.getDepartmentCode())&&
               !"".equalsIgnoreCase(department.getDepartmentCode())){
           dbp.setDepartmentCode(department.getDepartmentCode());
       }
       return departmentRepository.save(dbp);

    }

    @Override
    public Department fetchDepartmentByname(String depatmentName) {
        return departmentRepository.findByDepartmentName(depatmentName);
    }


}

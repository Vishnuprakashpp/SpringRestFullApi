package com.firstproject.springbootdemo.controller;

import com.firstproject.springbootdemo.entity.Department;
import com.firstproject.springbootdemo.services.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class  DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //private final Logger logger= LoggerFactory.getLogger(name:DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
 //       logger.info("inside the SaveDepartment");
//        when a client (e.g., a web browser or another application) sends an HTTP POST
//        request to this method, the Department object is expected to be present in the
//        request body.we used requestbody for getting it to json data
        return departmentService.saveDepartment(department);

        //the business logic is done in the service class/interface
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartment(){
        //creating a method to fetch all departmnet as list the method is in the departmentdervice
        return departmentService.fetchDepartment();
    }
    //fetching data by means of id
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentbyID(@PathVariable("id")Long deparmentId){
        return departmentService.fetchDepartmentbyID(deparmentId);
    }
    @DeleteMapping("/departments/{id}")
    //@PathVariable("id") specifies that the departmentId parameter is
    // intended to receive a value from the URI path. Specifically, it's expecting a path variable named "id."
    //When a client makes an HTTP request, such as a GET or DELETE request to a URL like "/departments/123,"
    // the value "123" is extracted from the
    // URL's path segment, and it's assigned to the departmentId parameter in your method.
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return "deleted successfully";
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByname(@PathVariable("name") String depatmentName){
        return departmentService.fetchDepartmentByname(depatmentName);
    }
}

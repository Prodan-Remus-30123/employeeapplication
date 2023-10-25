package com.utcn.employeeapplication.department;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Department create(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
}

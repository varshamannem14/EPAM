package com.epam.mapper;

import com.epam.model.Employee;
import com.epam.model.EmployeeDTO;


public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee employee){
        return new EmployeeDTO(employee.getId(),employee.getName(), employee.getDepartment(), employee.getBaseSalary(), employee.getJobTitle(), employee.getJoiningDate());
    }

    public static Employee toEntity(EmployeeDTO employeeDTO){
        return new Employee(employeeDTO.getId(), employeeDTO.getName(), employeeDTO.getDepartment(), employeeDTO.getBaseSalary(), employeeDTO.getJobTitle(), employeeDTO.getJoiningDate());
    }
}

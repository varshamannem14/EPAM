package com.epam.controller;

import com.epam.EmployeeNotFoundException;
import com.epam.mapper.EmployeeMapper;
import com.epam.model.Employee;
import com.epam.model.EmployeeDTO;
import com.epam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDTO employeeDTO){

        Employee employee = EmployeeMapper.toEntity(employeeDTO);
        employeeService.createEmployee(employee);
        return ResponseEntity.ok("Employee Added successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int id){

        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + id);
        }

        return ResponseEntity.ok(EmployeeMapper.toDTO(employee));
    }

    @GetMapping
    public List<EmployeeDTO> getEmployeeList(){
        return employeeService.getEmployeeList().stream()
                .map(EmployeeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO employeeDTO){

        Employee employee = EmployeeMapper.toEntity(employeeDTO);
        employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok("Updated Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){

        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @GetMapping("/{id}/payroll")
    public ResponseEntity<Double> calculatePayroll(@PathVariable int id){
        return ResponseEntity.ok(employeeService.calculatePayroll(id));

    }
    @GetMapping("/payroll")
    public ResponseEntity<Double> calculateTotalPayroll(){
        return ResponseEntity.ok(employeeService.calculateTotalPayroll());
    }



}

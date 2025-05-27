package com.epam.controller;

import com.epam.model.Employee;
import com.epam.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateEmployee() throws Exception {
        Employee employee = new Employee(1, "John Doe", "Engineering", 50000, "Developer", LocalDate.of(2020, 1, 10));

        doNothing().when(employeeService).createEmployee(any(Employee.class));

        mockMvc.perform(post("/api/employees")
                        .contentType(APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(employee))) // ✅ Fixed reference
                .andExpect(status().isOk())
                .andExpect(content().string("Employee Added successfully"));
    }

    @Test
    public void testGetEmployeeById() throws Exception {
        Employee employee = new Employee(1, "John Doe", "Engineering", 50000, "Developer", LocalDate.of(2020, 1, 10));
        when(employeeService.getEmployee(1)).thenReturn(employee);

        mockMvc.perform(get("/api/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("John Doe"));
    }

    @Test
    public void testGetEmployeeList() throws Exception {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", "Engineering", 50000, "Developer", LocalDate.of(2020, 1, 10)),
                new Employee(2, "Jane Doe", "HR", 40000, "HR Manager", LocalDate.of(2019, 3, 15))
        );
        when(employeeService.getEmployeeList()).thenReturn(employees);

        mockMvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }

    @Test
    public void testUpdateEmployee() throws Exception {
        Employee employee = new Employee(1, "John Doe", "Engineering", 60000, "Senior Developer", LocalDate.of(2020, 1, 10));
        doNothing().when(employeeService).updateEmployee(Mockito.anyInt(), any());

        mockMvc.perform(put("/api/employees/1")
                        .contentType(APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(employee))) // ✅ Fixed reference
                .andExpect(status().isOk())
                .andExpect(content().string("Updated Successfully"));
    }

    @Test
    public void testDeleteEmployee() throws Exception {
        doNothing().when(employeeService).deleteEmployee(1);

        mockMvc.perform(delete("/api/employees/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Deleted Successfully"));
    }

    @Test
    public void testCalculatePayroll() throws Exception {
        when(employeeService.calculatePayroll(1)).thenReturn(60000.0);

        mockMvc.perform(get("/api/employees/1/payroll"))
                .andExpect(status().isOk())
                .andExpect(content().string("60000.0"));
    }

    @Test
    public void testProcessPayroll() throws Exception {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", "Engineering", 50000, "Developer", LocalDate.of(2020, 1, 10)),
                new Employee(2, "Jane Doe", "HR", 40000, "HR Manager", LocalDate.of(2019, 3, 15))
        );


        double johnSalaryWithBonus = 50000 + (50000 * 0.20);
        double janeSalaryWithBonus = 40000 + (40000 * 0.10);
        double totalPayroll = johnSalaryWithBonus + janeSalaryWithBonus;

        when(employeeService.calculateTotalPayroll()).thenReturn(totalPayroll);

        mockMvc.perform(post("/api/employees/processPayroll")
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(totalPayroll)));
    }
}

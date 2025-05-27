package com.epam.service;

import com.epam.EmployeeNotFoundException;
import com.epam.model.Employee;
import com.epam.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImplementation employeeService;

    private Employee employee;
    private List<Employee> employees;

    @BeforeEach
    void setUp() {
        employees = Arrays.asList(
                new Employee(1, "John Doe", "Engineering", 50000, "Developer", LocalDate.of(2020, 1, 10)),
                new Employee(2, "Jane Smith", "HR", 45000, "HR Manager", LocalDate.of(2019, 3, 15)),
                new Employee(3, "Emily Johnson", "Engineering", 60000, "Senior Developer", LocalDate.of(2021, 6, 1))
        );
    }

    @Test
    void testCreateEmployee() {
        when(employeeRepository.save(employee)).thenReturn(employee);
        employeeService.createEmployee(employee);
        verify(employeeRepository, times(1)).save(employee);
    }

    @Test
    void testGetEmployee_Exists() {
        when(employeeRepository.findById(1)).thenReturn(Optional.of(employee));
        Employee foundEmployee = employeeService.getEmployee(1);
        assertNotNull(foundEmployee);
        assertEquals("John Doe", foundEmployee.getName());
    }

    @Test
    void testGetEmployee_NotFound() {
        when(employeeRepository.findById(1)).thenReturn(Optional.empty());
        assertNull(employeeService.getEmployee(1));
    }

    @Test
    void testGetEmployeeList() {
        List<Employee> employees = Arrays.asList(employee, new Employee(2, "Jane Doe", "HR", 50000, "HR Manager", LocalDate.of(2019, 5, 10)));
        when(employeeRepository.findAll()).thenReturn(employees);
        List<Employee> result = employeeService.getEmployeeList();
        assertEquals(2, result.size());
    }

    @Test
    void testUpdateEmployee() {
        when(employeeRepository.save(employee)).thenReturn(employee);
        employeeService.updateEmployee(1, employee);
        verify(employeeRepository, times(1)).save(employee);
    }

    @Test
    void testDeleteEmployee() {
        doNothing().when(employeeRepository).deleteById(1);
        employeeService.deleteEmployee(1);
        verify(employeeRepository, times(1)).deleteById(1);
    }

    @Test
    void testCalculatePayroll_ValidEmployee() {
        when(employeeRepository.findById(1)).thenReturn(Optional.of(employee));
        double payroll = employeeService.calculatePayroll(1);
        assertEquals(72000, payroll, 0.01);
    }

    @Test
    void testCalculatePayroll_EmployeeNotFound() {
        when(employeeRepository.findById(1)).thenReturn(Optional.empty());
        assertThrows(EmployeeNotFoundException.class, () -> employeeService.calculatePayroll(1));
    }

    @Test
    void testCalculateTotalPayroll() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", "Engineering", 60000, "Software Engineer", LocalDate.of(2020, 1, 15)),
                new Employee(2, "Jane Doe", "HR", 50000, "HR Manager", LocalDate.of(2019, 5, 10))
        );
        when(employeeRepository.findAll()).thenReturn(employees);
        double totalPayroll = employeeService.calculateTotalPayroll();
        assertEquals(127000, totalPayroll, 0.01);
    }


    @Test
    public void testFilterEmployeesByDepartment_ShouldReturnEmployeesOfSpecifiedDepartment() {
        String department = "Engineering";
        List<Employee> expected = employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .collect(Collectors.toList());

        when(employeeRepository.findAll()).thenReturn(employees);
        List<Employee> result = employeeService.filterEmployeesByDepartment(department);

        assertEquals(expected.size(), result.size());
        assertEquals(expected, result);
    }

    @Test
    public void testFilterEmployeesByNonExistentDepartment_ShouldReturnEmptyList() {
        String department = "Finance";

        when(employeeRepository.findAll()).thenReturn(employees);
        List<Employee> result = employeeService.filterEmployeesByDepartment(department);

        assertEquals(0, result.size());
    }

    @Test
    public void testFilterEmployeesWhenListIsEmpty_ShouldReturnEmptyList() {
        when(employeeRepository.findAll()).thenReturn(List.of());
        List<Employee> result = employeeService.filterEmployeesByDepartment("Engineering");

        assertEquals(0, result.size());
    }
}

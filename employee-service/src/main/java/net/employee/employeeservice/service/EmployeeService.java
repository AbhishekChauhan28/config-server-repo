package net.employee.employeeservice.service;

import net.employee.employeeservice.dto.ApiResponseDto;
import net.employee.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long employeeId);
}

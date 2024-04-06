package net.employee.employeeservice.service;

import net.employee.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {
    // Build GET department rest api
    @GetMapping("/api/department/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}

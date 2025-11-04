package school_management_service.school.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school_management_service.school.contract.EmployeeResponseDto;
import school_management_service.school.service.EmployeeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/list/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/active-by-date")
    public List<EmployeeResponseDto> getActiveEmployees() {
        return employeeService.listEmployeesByCreatedDateDesc();
    }
}
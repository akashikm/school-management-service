package school_management_service.school.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school_management_service.school.contract.DepartmentEmployeeCountDto;
import school_management_service.school.service.DepartmentService;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/list/departments")
public class DepartmentController {

    private final DepartmentService departmentService;


    @GetMapping("/more-than-five-employees")
    public List<DepartmentEmployeeCountDto> getDepartmentsWithMoreThanFiveEmployees() {
        return departmentService.getDepartmentsWithMoreThanFiveEmployees();
    }
}

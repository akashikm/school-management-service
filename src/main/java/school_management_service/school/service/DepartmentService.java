package school_management_service.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import school_management_service.school.contract.DepartmentEmployeeCountDto;
import school_management_service.school.repository.DepartmentRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    public List<DepartmentEmployeeCountDto> getDepartmentsWithMoreThanFiveEmployees() {

        return departmentRepository.findDepartmentsWithMoreThanFiveEmployees();

    }
}
package school_management_service.school.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import school_management_service.school.contract.EmployeeResponseDto;
import school_management_service.school.model.Employee;
import school_management_service.school.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public List<EmployeeResponseDto> listEmployeesByCreatedDateDesc() {
        List<Employee> employees = employeeRepository.findByActiveTrueOrderByCreatedDateDesc();

        return employees.stream()
                .map(employee -> {
                    EmployeeResponseDto dto = modelMapper.map(employee, EmployeeResponseDto.class);
                    if (employee.getDepartment() != null) {
                        dto.setDepartmentId(employee.getDepartment().getId());
                        dto.setDepartmentName(employee.getDepartment().getName());
                    }
                    return dto;
                })
                .toList();
    }
}


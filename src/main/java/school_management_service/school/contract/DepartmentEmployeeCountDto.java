package school_management_service.school.contract;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentEmployeeCountDto {
    private String departmentName;
    private Long employeeCount;
}
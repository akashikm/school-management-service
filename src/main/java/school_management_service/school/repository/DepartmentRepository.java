package school_management_service.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import school_management_service.school.contract.DepartmentEmployeeCountDto;
import school_management_service.school.model.Department;

import java.util.List;
import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<Department, UUID> {

    @Query("SELECT new school_management_service.school.contract.DepartmentEmployeeCountDto(d.name, COUNT(e)) " +
            "FROM Department d JOIN d.employees e " +
            "GROUP BY d.name HAVING COUNT(e) > 5")
    List<DepartmentEmployeeCountDto> findDepartmentsWithMoreThanFiveEmployees();

}

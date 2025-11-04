package school_management_service.school.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {

        private UUID id;

        private String name;

        private boolean active;

        private LocalDateTime createdDate;

        private UUID departmentId;

        private  String departmentName;
}

package jp.co.axa.apidemo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private Integer empID;
    private String empName;
    private Integer empSalary;
    private String empDepartment;
}

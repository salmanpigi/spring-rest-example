package id.co.mandiri.day2.mandiriday2.repository;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM employees e WHERE e.employee_id = :employeeId")
    Employee findEmployeeByID(Integer employeeId);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e INNER JOIN departments d ON " +
            "e.department_id = d.department_id WHERE e.department_id = :deptId and d.department_name = :deptName")
    List<Employee> findEmployeeByDeptIdAndDeptName(Integer deptId, String deptName);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e where e.employee_id = :id AND e.salary = :salary")
    Employee findEmployeeByIdAndSalary(Integer id, Integer salary);

    List<Employee> getEmployeesByJobIdAndDepartmentId(String jobId, Integer deptId);
}

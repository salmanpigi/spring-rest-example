package id.co.mandiri.day2.mandiriday2.repository;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM employees e WHERE e.employee_id = :employeeId")
    Employee findEmployeeById(Integer employeeId);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e INNER JOIN departments d ON " +
            "e.department_id = d.department_id WHERE e.department_id = :deptId and d.department_name = :deptName")
    List<Employee> findEmployeeByDeptIdAndDeptName(Integer deptId, String deptName);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e where e.employee_id = :id AND e.salary = :salary")
    Employee findEmployeeByIdAndSalary(Integer id, Integer salary);

    List<Employee> getEmployeesByJobIdAndDepartmentId(String jobId, Integer deptId);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e LEFT JOIN departments d ON " +
            "e.department_id = d.department_id WHERE e.department_id = :deptId and d.department_name = :deptName")
    List<Employee> leftJoin(Integer deptId, String deptName);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e RIGHT JOIN departments d ON " +
            "e.department_id = d.department_id WHERE e.department_id = :deptId and d.department_name = :deptName")
    List<Employee> rightJoin(Integer deptId, String deptName);

    @Query(nativeQuery = true, value = "SELECT * FROM employees e FULL OUTER JOIN departments d ON " +
            "e.department_id = d.department_id WHERE e.department_id = :deptId and d.department_name = :deptName")
    List<Employee> fullOuterJoin(Integer deptId, String deptName);

    @Override
    Optional<Employee> findById(Integer id);
}

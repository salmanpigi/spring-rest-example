package id.co.mandiri.day2.mandiriday2.repository;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM Employees e WHERE e.employee_id = :employeeId")
    Employee findEmployeeByID(Integer employeeId);

}

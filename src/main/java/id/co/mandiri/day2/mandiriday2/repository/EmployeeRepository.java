package id.co.mandiri.day2.mandiriday2.repository;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findByEmployeeId(Integer employeeId);
}

package id.co.mandiri.day2.mandiriday2.services;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findEmployeeById(Integer id);

    Employee findEmployeeByIdAndSalary(Integer id, Integer salary);

    List<Employee> findEmployeeByJobIdAndDeptId(String jobId, Integer deptId);

    List<Employee> findEmployeeByDeptIdAndDeptName(Integer deptId, String deptName);
}

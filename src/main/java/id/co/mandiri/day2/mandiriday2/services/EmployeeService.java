package id.co.mandiri.day2.mandiriday2.services;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findEmployeeById(Integer id);

    Employee findEmployeeByIdAndSalary(Integer id, Integer salary);

    List<Employee> findEmployeeByJobIdAndDeptId(String jobId, Integer deptId);

    List<Employee> findEmployeeByDeptIdAndDeptNameInnerJoin(Integer deptId, String deptName);

    List<Employee> findEmployeeByDeptIdAndDeptNameLeftJoin(Integer deptId, String deptName);

    List<Employee> findEmployeeByDeptIdAndDeptNameRightJoin(Integer deptId, String deptName);

    List<Employee> findEmployeeByDeptIdAndDeptNameLeftJoinFullOuterJoin(Integer deptId, String deptName);

    Employee removeEmployeeById(Integer id);

}

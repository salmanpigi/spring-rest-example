package id.co.mandiri.day2.mandiriday2.services.impl;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import id.co.mandiri.day2.mandiriday2.repository.EmployeeRepository;
import id.co.mandiri.day2.mandiriday2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee findEmployeeById(Integer id) {
        return repository.findEmployeeByID(id);
    }

    @Override
    public Employee findEmployeeByIdAndSalary(Integer id, Integer salary) {
        return repository.findEmployeeByIdAndSalary(id, salary);
    }

    @Override
    public List<Employee> findEmployeeByJobIdAndDeptId(String jobId, Integer deptId) {
        return repository.getEmployeesByJobIdAndDepartmentId(jobId, deptId);
    }

    @Override
    public List<Employee> findEmployeeByDeptIdAndDeptName(Integer deptId, String deptName) {
        return repository.findEmployeeByDeptIdAndDeptName(deptId, deptName);
    }

}

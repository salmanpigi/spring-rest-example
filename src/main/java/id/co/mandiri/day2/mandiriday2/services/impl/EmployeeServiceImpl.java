package id.co.mandiri.day2.mandiriday2.services.impl;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import id.co.mandiri.day2.mandiriday2.repository.EmployeeRepository;
import id.co.mandiri.day2.mandiriday2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee findEmployeeById(Integer id) {
        return repository.findById(id).orElse(null);
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
    public List<Employee> findEmployeeByDeptIdAndDeptNameInnerJoin(Integer deptId, String deptName) {
        return repository.findEmployeeByDeptIdAndDeptName(deptId, deptName);
    }

    @Override
    public List<Employee> findEmployeeByDeptIdAndDeptNameLeftJoin(Integer deptId, String deptName) {
        return repository.leftJoin(deptId, deptName);
    }

    @Override
    public List<Employee> findEmployeeByDeptIdAndDeptNameRightJoin(Integer deptId, String deptName) {
        return repository.rightJoin(deptId, deptName);
    }

    @Override
    public List<Employee> findEmployeeByDeptIdAndDeptNameLeftJoinFullOuterJoin(Integer deptId, String deptName) {
        return repository.fullOuterJoin(deptId, deptName);
    }


    @Transactional
    @Override
    public Employee removeEmployeeById(Integer id) {
        Employee EmployeeEntity = findEmployeeById(id);
        if (EmployeeEntity != null) {
            repository.deleteById(id);
            return EmployeeEntity;
        } else {
            return null;
        }
    }

}

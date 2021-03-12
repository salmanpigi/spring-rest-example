package id.co.mandiri.day2.mandiriday2.controller;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import id.co.mandiri.day2.mandiriday2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("native-query-1/{id}")
    public Employee findEmployeeById(@PathVariable Integer id) {
        return service.findEmployeeById(id);
    }

    @GetMapping("native-query-2/{id}")
    public Employee findEmployeeByDeptIdAndSalary(@PathVariable Integer id, @RequestParam Integer salary) {
        return service.findEmployeeByIdAndSalary(id, salary);
    }

    @GetMapping("native-query-3/inner-join/{deptId}")
    public List<Employee> findEmployeeByDeptIdAndDeptNameInnerJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.findEmployeeByDeptIdAndDeptNameInnerJoin(deptId, deptName);
    }

    @GetMapping("native-query-4/left-join/{deptId}")
    public List<Employee> findEmployeeByDeptIdAndDeptNameLeftJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.findEmployeeByDeptIdAndDeptNameLeftJoin(deptId, deptName);
    }

    @GetMapping("native-query-5/right-join/{deptId}")
    public List<Employee> rightJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.findEmployeeByDeptIdAndDeptNameRightJoin(deptId, deptName);
    }

    @GetMapping("native-query-6/fullOuterJoin/{deptId}")
    public List<Employee> fullOuterJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.findEmployeeByDeptIdAndDeptNameLeftJoinFullOuterJoin(deptId, deptName);
    }

    @GetMapping("jpa-1/{jobId}")
    public List<Employee> findEmployeeByNameAndSalary(@PathVariable String jobId, @RequestParam Integer deptId) {
        return service.findEmployeeByJobIdAndDeptId(jobId, deptId);
    }

    @DeleteMapping("/jpa-2/delete/{id}")
    public Employee removeEmployeeById(@PathVariable Integer id) {
        return service.removeEmployeeById(id);
    }
}

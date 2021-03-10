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

    @GetMapping("native-query-3/{deptId}")
    public List<Employee> findEmployeeByDeptIdAndDeptName(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.findEmployeeByDeptIdAndDeptName(deptId, deptName);
    }

    @GetMapping("native-query-4/{deptId}")
    public List<Employee> leftJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.leftJoin(deptId, deptName);
    }

    @GetMapping("native-query-5/{deptId}")
    public List<Employee> rightJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.rightJoin(deptId, deptName);
    }

    @GetMapping("native-query-6/{deptId}")
    public List<Employee> fullOuterJoin(@PathVariable Integer deptId, @RequestParam String deptName) {
        return service.fullOuterJoin(deptId, deptName);
    }

    @GetMapping("jpa-1/{jobId}")
    public List<Employee> findEmployeeByNameAndSalary(@PathVariable String jobId, @RequestParam Integer deptId) {
        return service.findEmployeeByJobIdAndDeptId(jobId, deptId);
    }

    @DeleteMapping("/jpa-2/{id}")
    public Employee removeEmployeeById(@PathVariable Integer id) {
        return service.removeEmployeeById(id);
    }
}

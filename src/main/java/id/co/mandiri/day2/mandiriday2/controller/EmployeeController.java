package id.co.mandiri.day2.mandiriday2.controller;

import id.co.mandiri.day2.mandiriday2.requests.EmployeeRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
@RestController
public class EmployeeController {

    @GetMapping
    public EmployeeRequest getEmployee() {
        EmployeeRequest employeeRequest = new EmployeeRequest(1, "Salman", "Jakarta");
        return employeeRequest;
    }

    @GetMapping("/{name}")
    public String getEmployeeName(@PathVariable String name, @RequestParam(value = "umur", defaultValue = "22") String age) {
        return "Hello " + name + " Age " + age;
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody String name) {
        return "Add employee name: " + name;
    }

    @PostMapping("/add-2")
    public EmployeeRequest addEmployee(@RequestBody EmployeeRequest request) {
        return request;
    }



    @DeleteMapping("/delete")
    public String deleteEmployee() {
        return "delete successful";
    }

}

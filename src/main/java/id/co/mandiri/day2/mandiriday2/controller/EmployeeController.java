package id.co.mandiri.day2.mandiriday2.controller;

import id.co.mandiri.day2.mandiriday2.requests.EmployeeRequest;
import id.co.mandiri.day2.mandiriday2.responses.EmployeeResponse;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
@RestController
public class EmployeeController {

    @GetMapping("/{id}")
    public EmployeeResponse findEmployeeById(
                                              @PathVariable Integer id) {
        EmployeeRequest request = new EmployeeRequest(id, "name", "address");
        EmployeeResponse response = new EmployeeResponse();
        response.setId(request.getId());
//        response.setName(request.getName());
//        response.setAddress(request.getAddress());

        return response;
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


}

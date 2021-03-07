package id.co.mandiri.day2.mandiriday2.controller;

import id.co.mandiri.day2.mandiriday2.requests.EmployeeRequest;
import id.co.mandiri.day2.mandiriday2.responses.EmployeeResponse;
import id.co.mandiri.day2.mandiriday2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/{id}")
    public EmployeeResponse findEmployeeData(@RequestParam String name, @PathVariable Integer id) {

        EmployeeRequest request = new EmployeeRequest();
        EmployeeRequest data = service.findData(id, name);
        EmployeeResponse response = new EmployeeResponse();
        if (data == null) {
            System.out.println("Data Not Found");
        } else {
            response.setId(request.getId());
            response.setName(request.getName());
            response.setAddress(request.getAddress());
        }
        return response;
    }

    @PostMapping("/add-1")
    public String addEmployeeSuccess(@RequestBody EmployeeRequest request) {
        EmployeeResponse response = new EmployeeResponse();
        return response.success();
    }

    @PostMapping("/add-2")
    public EmployeeResponse addEmployeeData(@RequestBody EmployeeRequest request) {
        EmployeeResponse response = new EmployeeResponse();
        response.setId(request.getId());
        response.setName(request.getName());
        response.setAddress(request.getAddress());
        return response;
    }

    @PostMapping("/add-3")
    public String addEmployeeError(@RequestBody EmployeeRequest request) {
        EmployeeResponse response = new EmployeeResponse();
        return response.error();
    }

}

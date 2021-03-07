package id.co.mandiri.day2.mandiriday2.services;

import id.co.mandiri.day2.mandiriday2.requests.EmployeeRequest;

public class EmployeeService implements CommonService<EmployeeRequest, Integer> {
    @Override
    public EmployeeRequest findById(Integer id) {
        EmployeeRequest request = new EmployeeRequest();
        if(request.getId() == id) {
            return request;
        } else {
            return null;
        }
    }
}

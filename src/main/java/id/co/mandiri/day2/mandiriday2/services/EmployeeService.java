package id.co.mandiri.day2.mandiriday2.services;

import id.co.mandiri.day2.mandiriday2.model.requests.EmployeeRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements CommonService<EmployeeRequest, Integer> {
    @Override
    public EmployeeRequest findData(Integer id, String name) {
        EmployeeRequest request = new EmployeeRequest();
        if((request.getId() == id) && (request.getName().equals(name) )) {
            return request;
        } else {
            return null;
        }
    }
}

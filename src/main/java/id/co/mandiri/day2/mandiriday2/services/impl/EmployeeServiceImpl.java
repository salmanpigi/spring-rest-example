package id.co.mandiri.day2.mandiriday2.services.impl;

import id.co.mandiri.day2.mandiriday2.model.entity.Employee;
import id.co.mandiri.day2.mandiriday2.repository.EmployeeRepository;
import id.co.mandiri.day2.mandiriday2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;


    @Override
    public Employee findData(Integer integer, String name) {
        return null;
    }

    @Override
    public Employee findById(Integer id) {
        return repository.findEmployeeByID(id);
    }
}

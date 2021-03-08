package id.co.mandiri.day2.mandiriday2.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(length = 50)
    private String name;

    @Column(length = 100)
    private String address;

}

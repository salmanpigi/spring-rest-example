package id.co.mandiri.day2.mandiriday2.requests;

public class EmployeeRequest {
    public Integer id = 1;
    public String name = "salman";
    public String address = "jakarta";

    public EmployeeRequest(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public EmployeeRequest(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

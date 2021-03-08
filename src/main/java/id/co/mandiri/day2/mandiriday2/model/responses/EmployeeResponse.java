package id.co.mandiri.day2.mandiriday2.model.responses;

public class EmployeeResponse {

    public Integer id;
    public String name;
    public String address;

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

    public String success() {
        return "Success";
    }

    public String error() {
        return "Error";
    }


}

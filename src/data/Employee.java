
package data;

public abstract class Employee {
    protected String code;
    protected String name;
    protected String phone;
    protected String address;
    protected String department;

    public Employee(String code, String name, String phone, String address, 
                    String department) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public abstract double getTotalSalary();
    
    public abstract String showInfo();
    
}

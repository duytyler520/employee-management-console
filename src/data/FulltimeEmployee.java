
package data;

public class FulltimeEmployee extends Employee {
    private double salary;
    private int absent;

    public FulltimeEmployee(String code, String name, String phone, String address, 
            String department, double salary, int absent) {
        super(code, name, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    @Override
    public double getTotalSalary() {
        return this.salary - (this.absent * 35);
    }

    @Override
    public String showInfo() {
        return String.format("|%-7s|%-20s|%12.2f|",
                code, name, getTotalSalary());
    }
    
    
}

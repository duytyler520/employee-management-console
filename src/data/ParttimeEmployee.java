
package data;

public class ParttimeEmployee extends Employee {
    private double dailyWage;
    private int present;

    public ParttimeEmployee(String code, String name, String phone, String address, 
            String department, double dailyWage, int present) {
        super(code, name, phone, address, department);
        this.dailyWage = dailyWage;
        this.present = present;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    @Override
    public double getTotalSalary() {
        return this.dailyWage * this.present;
    }

    @Override
    public String showInfo() {
        return String.format("|%-7s|%-20s|%12.2f|",
                code, name, getTotalSalary());
    }
    
    
}

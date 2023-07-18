package datamanagement;

import data.Employee;
import data.FulltimeEmployee;
import data.ParttimeEmployee;
import java.util.ArrayList;
import util.MyUtils;

public class EmployeeList {

    private ArrayList employeeList = new ArrayList();

    //Ktra số lượng nv đã đạt giới hạn hay chưa
    private boolean checkEmployeeLimit() {
        if (employeeList.size() >= 100) {
            System.out.println("The company has reached "
                               + "the maximum limit of employees (100).");
            return false;
        }
        return true;
    }
    
    //Ktra code có bị trùng ko
    private int checkCode(String code) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (((Employee) employeeList.get(i)).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public void createFullEmployee() {
        String code, name, phone, address, department;
        double salary;
        int absent;

        //Kiểm tra số lượng nv hiện có
        if (!checkEmployeeLimit()) {
            return;
        }
        
        System.out.println("Please provide the following information:");

        do {
            code = MyUtils.getStringreg("Enter the employee code "
                                    + "(starts with FS followed by 5 digits): ", 
                                        "^FS\\d{5}$", 
                                        "Error: Code cannot be empty!", 
                                        "Error: Code is not valid!");
            if (checkCode(code) >= 0) {
                System.out.println("The employee code already exists. "
                                    + "Please enter another one!");
                continue;
            }
            break;
        } while (true);

        name = MyUtils.getString("Enter the employee's full name: ", 
                                 "Error: Name cannot be empty!");
        phone = MyUtils.getStringreg("Enter the employee's phone: ", 
                                     "\\d{10,11}", 
                                     "Error: Phone cannot be empty!", 
                                     "Error: Phone is not valid (10-11 digits)!");
        address = MyUtils.getString("Enter the employee's address: ", 
                                    "Error: Address cannot be empty!");
        department = MyUtils.getString("Enter the employee's department: ", 
                                       "Error: Department cannot be empty!");
        salary = MyUtils.getDoubleEx("Enter the employee's salary "
                                    + "(must be greater than $1500): ", 1500);
        absent = MyUtils.getIntIn("Enter the employee's absent: ", 0);

        employeeList.add(new FulltimeEmployee(code, name, phone, address, 
                                            department, salary, absent));

        System.out.println("Employee created successfully!");
    }

    public void createPartEmployee() {
        String code, name, phone, address, department;
        double dailyWage;
        int present;

        ////Kiểm tra số lượng nv hiện có
        if (!checkEmployeeLimit()) {
            return;
        }
        
        System.out.println("Please provide the following information:");

        do {
            code = MyUtils.getStringreg("Enter the employee code "
                                    + "(starts with FS followed by 5 digits): ", 
                                        "^FS\\d{5}$", 
                                        "Error: Code cannot be empty!", 
                                        "Error: Code is not valid!");
            if (checkCode(code) >= 0) {
                System.out.println("The employee code already exists. "
                                + "Please enter another one!");
                continue;
            }
            break;
        } while (true);
        
        name = MyUtils.getString("Enter the employee's full name: ", 
                                 "Error: Name cannot be empty!");
        phone = MyUtils.getStringreg("Enter the employee's phone: ", 
                                     "\\d{10,11}", 
                                     "Error: Phone cannot be empty!", 
                                     "Error: Phone is not valid (10-11 digits)!");
        address = MyUtils.getString("Enter the employee's address: ", 
                                    "Error: Address cannot be empty!");
        department = MyUtils.getString("Enter the employee's department: ", 
                                       "Error: Department cannot be empty!");
        dailyWage = MyUtils.getDoubleEx("Enter the employee's daily wage "
                                        + "(must be greater than $10): ", 10);
        present = MyUtils.getIntEx("Enter the employee's present: ", 0);

        employeeList.add(new ParttimeEmployee(code, name, phone, address, 
                                                department, dailyWage, present));

        System.out.println("Employee created successfully!");
    }

    public void printFullEmployeeList() {  
        System.out.println("Here is the parttime employee list");
        String header = String.format("|%-7s|%-20s|%12s|",
                "CODE", "NAME", "TOTAL SALARY");
        System.out.println(header);
        for (Object employee : employeeList) {
            if (employee instanceof FulltimeEmployee) {
                System.out.println(((FulltimeEmployee) employee).showInfo());
            }
        }
    }

    public void printPartEmployeeList() {
        System.out.println("Here is the parttime employee list");
        String header = String.format("|%-7s|%-20s|%12s|",
                "CODE", "NAME", "TOTAL SALARY");
        System.out.println(header);
        for (Object employee : employeeList) {
            if (employee instanceof ParttimeEmployee) {
                System.out.println(((ParttimeEmployee) employee).showInfo());
            }
        }
    }

}

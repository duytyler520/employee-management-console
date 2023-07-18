package main;

import datamanagement.EmployeeList;
import util.MyUtils;

public class EmployeeManagement {

    public static void main(String[] args) {
        EmployeeList empList = new EmployeeList();
        int choice;
        
        do {
            System.out.println("\n========== Employee Management System ==========\n");
            System.out.println("Please select an option:");
            System.out.println("1. Create a new full-time employee");
            System.out.println("2. Create a new part-time employee");
            System.out.println("3. Print list of full-time employees");
            System.out.println("4. Print list of part-time employees");
            System.out.println("5. Exit");

            choice = MyUtils.getInt("Enter your choice (1-5): ", 
                                    "You are required to choose (1-5)!", 1, 5);

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------------------");
                    empList.createFullEmployee();
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    empList.createPartEmployee();
                    break;
                case 3:
                    System.out.println("------------------------------------------------");
                    empList.printFullEmployeeList();
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    empList.printPartEmployeeList();
                    break;
                case 5:
                    System.out.println("Thank you for using the Employee Management System. "
                                        + "Goodbye!");
                    break;
            }
        } while (choice != 5);

    }
}

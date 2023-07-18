package util;
import java.util.Scanner;

public class MyUtils {

    public static String getString(String welcome, String msg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static String getStringreg(String welcome, String pattern, String msg, 
                                        String msgreg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else if (!result.matches(pattern)) {
                System.out.println(msgreg);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }
    
    //Chỉ nhận giá trị >= min
    public static int getIntIn(String welcome, int minInclusive) {
        boolean check = true;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                if (number < minInclusive) {
                    System.out.println("Number must be greater than or equal to " 
                                        + minInclusive);
                } else {
                    check = false;
                }

            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number < minInclusive);
        return number;
    }
    
    //Chỉ nhận giá trị > min
    public static int getIntEx(String welcome, int minExclusive) {
        boolean check = true;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                if (number <= minExclusive) {
                    System.out.println("Number must be greater than " 
                                        + minExclusive);
                } else {
                    check = false;
                }

            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number <= minExclusive);
        return number;
    }
    
    public static int getInt(String welcome, String msg, int min, int max) {
        boolean check = true;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                if (number < min || number > max) {
                    System.out.println(msg);
                } else {
                    check = false;
                }

            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number < min);
        return number;
    }
    
    //Chỉ nhận giá trị > min
    public static double getDoubleEx(String welcome, int minExclusive) {
        boolean check = true;
        double number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.print(welcome);
                number = Double.parseDouble(sc.nextLine());
                if (number <= minExclusive) {
                    System.out.println("Number must be greater than " 
                                        + minExclusive);
                } else {
                    check = false;
                }

            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number <= minExclusive);
        return number;
    }
    
    //Chỉ nhận giá trị >= min
    public static double getDoubleIn(String welcome, int minInclusive) {
        boolean check = true;
        double number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.print(welcome);
                number = Double.parseDouble(sc.nextLine());
                if (number < minInclusive) {
                    System.out.println("Number must be greater than or equal to " 
                                        + minInclusive);
                } else {
                    check = false;
                }

            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number < minInclusive);
        return number;
    }

}

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {

        while (true) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println();
        System.out.println("Enter a year : ");
        year = sc.nextInt();

        boolean isLeapYear = false;

        boolean leap4 = year % 4 == 0;
        if (leap4) {
            boolean leap100 = year % 100 == 0;
            if (leap100) {
                boolean leap400 = year % 400 == 0;
                if (leap400) {
                    isLeapYear = true;
                }
            }  else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }


//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//        if (isLeapYear) {
//            System.out.printf("%d is a leap year", year);
//        } else {
//            System.out.printf("%d is not leap year", year);
//        }


//            if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is not leap year",year);
//                }
//            } else {
//                System.out.printf("%d is leap year",year);
//            }
//        } else {
//            System.out.printf("%d is not leap year",year);
//        }
    }
    }
}

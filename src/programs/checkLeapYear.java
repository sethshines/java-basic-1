package programs;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year to check for leap year.");
        int year = scan.nextInt();
        if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.printf("%d is a leap year.", year);
            return;
        }
        System.out.printf("%d is not a leap year.", year);

    }
}

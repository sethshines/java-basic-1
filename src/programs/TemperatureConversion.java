package programs;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Convertor!");
        System.out.println("Please choose from bellow options");
        System.out.println("1. convert celsius to Fahrenheit");
        System.out.println("2. convert Fahrenheit to celsius");
        System.out.println("Please enter 1 or 2");
        int selections = scan.nextInt();

        switch (selections) {
            case 1:
                System.out.println("Please enter value in celsius");
                int celsiusTemp = scan.nextInt();
                System.out.printf("%d in Fahrenheit is %d", celsiusTemp, ((celsiusTemp * 9)/5) + 32);
                break;
            case 2:
                System.out.println("Please enter value in Fahrenheit");
                int fahrenheitTemp = scan.nextInt();
                System.out.printf("%d in celsius is %d", fahrenheitTemp, ((fahrenheitTemp - 32) * 5/9));
                break;
        }

        scan.close();

    }
}

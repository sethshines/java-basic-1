package programs;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Please enter your age:");
        int age = scan.nextInt();
        System.out.printf("Hello %s! (%d) Welcome to Saskatchewan!", name, age);
    }
}

package programs;

public class Factorial {
    public static void main(String[] args) {
        int x = 4;
        int factorial= 1;
        for(int i=x;i>0;i--) {
            factorial*=i;
        }

        System.out.printf("Factorial of %d is %d", x, factorial);
    }
}

package programs;

public class IsPalindrome {

    public static void main(String[] args) {
        int number = 121;
        System.out.println("Number 121 is Palindrome:- " + isPalindrome(number));
        System.out.println("String 121 is Palindrome:- " + isPalindrome("121"));
        System.out.println("Number 123 is Palindrome:- " + isPalindrome(123));
        System.out.println("String 123 is Palindrome:- " + isPalindrome("123"));

    }

    public static boolean isPalindrome(int number) {
        int value = number;
        int result = 0;
        while(value > 0) {
            int unitPlace = value % 10;
            result  = result*10 + unitPlace;
            value = value / 10;
        }

        return number == result;
    }

    public static boolean isPalindrome(String number) {
        StringBuilder str = new StringBuilder(number);
        return str.reverse().toString().equals(number);
    }
}

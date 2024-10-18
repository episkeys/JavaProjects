import java.util.Scanner;

public class isPalindrome {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();

        int reverse = 0;
        int original = number;
        //1221
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        System.out.println(reverse == original ? "palindrome" : "not palindrome");
    }
}

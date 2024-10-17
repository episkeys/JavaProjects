import java.util.Scanner;

public class isSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lastNumber = 0;
        int secondLastNumber = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            if (count >= 1) {
                secondLastNumber = lastNumber;
            }
            lastNumber = n;
            count++;

            if(count >= 2){
                if (lastNumber < secondLastNumber) {
                    System.out.println("Smaller than previous number\n");
                } else {
                    System.out.println("Greater than previous number\n");
                }
            }

        }





    }


}

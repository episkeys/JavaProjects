import java.util.Scanner;

public class yasHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tday = 17;
        int tmonth = 10;
        int tyear = 2024;

        int day;
        int month;
        int year;

        while (true) {
            System.out.println("enter your birth day: ");
            day = sc.nextInt();
            System.out.println("enter your birth month: ");
            month = sc.nextInt();
            System.out.println("enter your birth year: ");
            year = sc.nextInt();

            if (day >= 1 && day <= 31 && year >= 1900 && year <= 2024 && month >= 1 && month <= 12) {
                break;
            } else {
                System.out.println("invalid input");
            }
        }
        int ageYears = tyear - year;

        int ageMonths = tmonth - month;
        if (ageMonths <= 0) {
            ageYears -= 1;
            ageMonths += 12;
        }

        int ageDays = tday - day;
        if (ageDays <= 0) {
            ageMonths -= 1;
            ageDays += 30;
        }
        System.out.printf("You are %d years, %d months and %d days old.\n", ageYears, ageMonths, ageDays);


    }
}


import java.util.Scanner;

public class ardisikSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sonBirinci = 0;
        int sonIkinci = 0;
        int counter = 0;

        while (true) {
            System.out.println("Lütfen bir değer giriniz: ");
            int a = scanner.nextInt();

            if (a < 0) {
                System.out.println("Negatif sayı girildi program bitiriliyor...");
                if (counter >= 2) {
                    if (Math.abs(sonBirinci - sonIkinci) == 1) {
                        System.out.println("Son iki sayı ardışıktı");
                    }

                } else {
                    System.out.println("Yeterli sayı girilmedi");
                }
                break;
            }
            if (counter >= 1) {
                sonIkinci = sonBirinci;
            }
            sonBirinci = a;
            counter++;
        }


    }
}

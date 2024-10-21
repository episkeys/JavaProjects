public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {

            if ((number % 10) % 2 == 0) {
                sum += (number % 10);
            }
            number = number / 10;

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(15)); // 0
        System.out.println(getEvenDigitSum(3835)); // 8
        System.out.println(getEvenDigitSum(749214)); // 10
        System.out.println(getEvenDigitSum(841962)); // 20

    }
}

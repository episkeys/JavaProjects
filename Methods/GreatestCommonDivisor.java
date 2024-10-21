public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 0;

        for (int i = 1; i <= first || i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                if (i > gcd) {
                    gcd = i;
                }
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 20)); // 10
        System.out.println(getGreatestCommonDivisor(165, 35)); // 5
        System.out.println(getGreatestCommonDivisor(1688, 686)); // 2
    }
}


public class PerfectNumber {
    public static boolean isPerfectNumber(int number){

        if (number < 1){
            return false;
        }

        int sum = 0;

        for(int i = 1;i < number; i++ ){

            if (number % i == 0){
                sum += i;

            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(27)); // false
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(56)); // false
        System.out.println(isPerfectNumber(6)); // true
    }
}

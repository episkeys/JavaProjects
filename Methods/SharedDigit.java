public class SharedDigit {

    public static boolean hasSharedDigit(int i1, int i2) {

        if (i1 < 10 || i1 > 99 || i2 < 10 || i2 > 99) {
            return false;
        }

        int i1_fd = i1 / 10;
        int i1_ld = i1 % 10;

        int i2_fd = i2 / 10;
        int i2_ld = i2 % 10;

        return i1_fd == i2_fd || i1_fd == i2_ld || i1_ld == i2_fd || i1_ld == i2_ld;

    }

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(1, 10)); // false
        System.out.println(hasSharedDigit(18, 68)); // true
        System.out.println(hasSharedDigit(17, 25)); // false
        System.out.println(hasSharedDigit(63, 23)); // true
    }
}
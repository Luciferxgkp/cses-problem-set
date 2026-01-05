
import java.util.*;

class MissingNumber {

    private static final Scanner scanner = new Scanner(System.in);

    private static long totalSum(long length) {
        long sum = 0;
        for (long index = 1; index <= length; index++) {
            sum += index;
        }
        return sum;
    }

    private static long findMissingNumber(long length) {
        long sum = 0;

        for (int index = 0; index < length - 1; index++) {
            long number = scanner.nextLong();
            sum += number;
        }

        return totalSum(length) - sum;
    }

    public static void main(String[] args) {

        long length = scanner.nextLong();

        System.out.println(findMissingNumber(length));
    }
}

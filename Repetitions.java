
import java.util.Scanner;

class Repetitions {

    private static final Scanner scanner = new Scanner(System.in);

    private static int findMaxRepetitionCount(String input) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        char prevChar = input.charAt(0);
        for (char currentChar : input.toCharArray()) {
            if (currentChar == prevChar) {
                count++;
            } else {
                prevChar = currentChar;
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        String input = scanner.next();
        System.out.println(findMaxRepetitionCount(input));
    }
}

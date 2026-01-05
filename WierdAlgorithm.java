
import java.util.*;

/*
    CSES Problem - Weird Algorithm - https://cses.fi/problemset/task/1068/
    Solution - 

    1. we have to take a integer input
    2. we have to print the input as in the loop we will not able to print the first one
    3. we have to loop through while input > 1
        1. if the input is Even then divide it by 2,
        2. if its odd multiply by 3 and then add 1
        3. Print the input
        
 */
class WierdAlgorithm {

    private static boolean isEven(long number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextInt();

        System.out.print(input + " ");

        while (input > 1) {
            if (isEven(input)) {
                input /= 2;
            } else {
                input = (input * 3) + 1;
            }
            System.out.print(input + " ");
        }
    }
}

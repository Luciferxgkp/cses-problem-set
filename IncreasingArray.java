
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class IncreasingArray {

    static class InputReader {

        final private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

    private static final InputReader scanner = new InputReader();

    private static long getMinimumNumberOfMovesToMakeIncreasingArray(int length, long[] array) {
        long totalMoves = 0;
        for (int index = 1; index < length; index++) {
            if (array[index - 1] > array[index]) {
                totalMoves += (array[index - 1] - array[index]);
                array[index] = array[index - 1];
            }
        }
        return totalMoves;
    }

    public static void main(String[] args) {
        int length = scanner.nextInt();
        long[] array = new long[length];
        for (int index = 0; index < length; index++) {
            array[index] = scanner.nextLong();
        }

        System.out.println(getMinimumNumberOfMovesToMakeIncreasingArray(length, array));
    }
}

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] inputs = reader.readLine().split(" ");
        int[] numbers = new int[inputs.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            writer.write(number + " ");
            writer.flush();
        }
    }
}

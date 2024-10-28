import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int reps = Integer.parseInt(br.readLine());

        final List<Integer> result = new ArrayList<>();

        for (int i = 0; i < reps; i++) {
            final int input = Integer.parseInt(br.readLine());
            result.add(input);
        }

        result.sort(Comparator.naturalOrder());

        for (int number : result) {
            bw.write(number + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
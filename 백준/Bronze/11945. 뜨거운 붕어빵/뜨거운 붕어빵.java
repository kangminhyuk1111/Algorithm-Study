import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] inputs = reader.readLine().split(" ");
        final int a = Integer.parseInt(inputs[0]);

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            final String[] strings = reader.readLine().split("");
            final List<String> stringList = Arrays.asList(strings);
            Collections.reverse(stringList);
            String result = String.join("", stringList);
            answer.add(result);
        }

        for (String s : answer) {
            writer.write(s);
            writer.newLine();
        }

        writer.flush();
        writer.close();
    }
}

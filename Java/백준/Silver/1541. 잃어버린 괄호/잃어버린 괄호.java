import java.io.*;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final String[] parts = br.readLine().split("-");

    int sum = 0;

    for (int i = 0; i < parts.length; i++) {
      final int num = Arrays.stream(parts[i].split("\\+")).mapToInt(Integer::parseInt).sum();

      if(i == 0) {
        sum += num;
        continue;
      }

      sum -= num;
    }

    System.out.println(sum);
  }
}

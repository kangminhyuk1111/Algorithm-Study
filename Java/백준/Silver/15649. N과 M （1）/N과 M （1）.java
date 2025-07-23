import java.io.*;
import java.util.Arrays;

public class Main {

  static int[] arr;
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    final int N = inputs[0];
    final int M = inputs[1];

    arr = new int[M];
    visited = new boolean[N+1];
    backtrack(N, M, 0);
  }

  private static void backtrack(final int N, final int M, final int depth) {
    if (depth == M) {
      for (int num : arr) {
        System.out.print(num + " ");
      }
      System.out.println();
      return;
    }

    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        arr[depth] = i;
        backtrack(N, M, depth + 1);

        visited[i] = false;
      }
    }
  }
}

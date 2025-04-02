import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (queue.size() > 1) {
            for (int i = 0; i < K-1; i++) {
                int item = queue.poll();
                queue.add(item);
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll());

        bw.write("<" + sb.toString().trim() + ">");
        br.close();
        bw.flush();
        bw.close();
    }
}
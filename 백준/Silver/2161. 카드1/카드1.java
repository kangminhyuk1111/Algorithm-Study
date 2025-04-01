import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                int y = queue.poll();
                sb.append(y);
                break;
            } else {
                int x = queue.poll();
                int y = queue.poll();
                sb.append(x).append(" ");
                queue.add(y);
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
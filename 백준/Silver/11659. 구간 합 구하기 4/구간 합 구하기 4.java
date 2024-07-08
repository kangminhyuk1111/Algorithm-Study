import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        final int[] prefixSum = new int[N+1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i-1] + Integer.parseInt(st.nextToken());
        }

        // 3회 반복
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            final int A = Integer.parseInt(st.nextToken());
            final int B = Integer.parseInt(st.nextToken());

            int answer = prefixSum[B] - prefixSum[A-1];

            System.out.println(answer);
        }

        br.close();
    }
}
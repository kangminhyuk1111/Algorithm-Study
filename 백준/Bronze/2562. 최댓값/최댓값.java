import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int max = 0;
        int len = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            final int N = Integer.parseInt(st.nextToken());

            if(N > max) {
                max = N;
                len = i;
            }
        }

        bw.write(max + "\n");
        bw.write((len+1) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
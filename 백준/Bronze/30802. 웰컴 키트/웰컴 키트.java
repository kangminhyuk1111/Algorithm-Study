import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int N = Integer.parseInt(br.readLine());
        final int[] shirts = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final String[] inputs = br.readLine().split(" ");
        final int T = Integer.parseInt(inputs[0]);
        final int P = Integer.parseInt(inputs[1]);
        
        int shirtBundles = 0;
        for (int shirt : shirts) {
            if (shirt > 0) {
                shirtBundles += (shirt + T - 1) / T;
            }
        }

        int b = N / P;
        int remain = N % P;

        bw.write(shirtBundles + "\n" + b + " " + remain);
        bw.flush();
        bw.close();
        br.close();
    }
}
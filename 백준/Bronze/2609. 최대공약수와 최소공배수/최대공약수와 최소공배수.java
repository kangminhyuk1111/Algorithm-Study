import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] inputs = br.readLine().split(" ");
        final int a = Integer.parseInt(inputs[0]);
        final int b = Integer.parseInt(inputs[1]);
        final int gcd = gcd(a, b);
        final int lcm = lcm(a, b, gcd);

        bw.write(gcd + "\n" + lcm);
        bw.flush();
        bw.close();
        br.close();
    }

    static int gcd(int a, int b) {
        final int c = a % b;

        if (c == 0) {
            return b;
        }

        return gcd(b, c);
    }

    static int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}
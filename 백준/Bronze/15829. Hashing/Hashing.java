import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(br.readLine());
        final char[] alphabets = br.readLine().toCharArray();

        int i = 0;

        int result = 0;

        for (char alphabet : alphabets) {
            int alphabetIndex = alphabet - 'a' + 1;
            final int pow = (int) Math.pow(31, i++);

            result += alphabetIndex * pow;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
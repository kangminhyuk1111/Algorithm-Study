import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final String input = reader.readLine();
        int num = Integer.parseInt(input);

        if(num == 0) {
            writer.write("1");  // 0! = 1
            writer.flush();
            return;  // 프로그램 종료
        }

        BigInteger result = BigInteger.ONE;
        for (int i = num; i >= 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        writer.write(String.valueOf(result));
        writer.flush();
    }
}


import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] inputs = reader.readLine().split(" ");
        final Integer push = Integer.parseInt(inputs[0]);
        final Integer length = Integer.parseInt(inputs[1]);
        final String string = reader.readLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            final char c = string.charAt(i);
            if (c == ' ' || c == '.' || c == ',') {
                // 공백, 온점, 쉼표는 그대로 출력
                result.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자 처리
                int newAscii = ((c - 'A') + push) % 26 + 'A';
                result.append((char) newAscii);
            } else if (c >= 'a' && c <= 'z') {
                // 소문자 처리
                int newAscii = ((c - 'a') + push) % 26 + 'a';
                result.append((char) newAscii);
            }
        }

        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}

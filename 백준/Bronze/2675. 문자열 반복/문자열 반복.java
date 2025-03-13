import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer temp = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < temp; i++) {
            String[] inputs = br.readLine().split(" ");
            Integer repeatCount = Integer.parseInt(inputs[0]); // 3
            String str = inputs[1]; // abc
            String[] chars = str.split(""); // a,b,c

            for(int j = 0; j < chars.length; j++) {
                for (int k = 0; k < repeatCount; k++) {
                    sb.append(chars[j]);
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
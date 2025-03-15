import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] sGrade = br.readLine().split(" ");
        double[] grades = new double[N];
        double max = Double.parseDouble(sGrade[0]);
        double result = 0;

        for (int i = 0; i < N; i++) {
            grades[i] = Double.parseDouble(sGrade[i]);
        }

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        for (int i = 0; i < grades.length; i++) {
            result += grades[i] / max * 100;
        }

        bw.write(String.valueOf(result/N));
        bw.flush();
        bw.close();
        br.close();
    }
}
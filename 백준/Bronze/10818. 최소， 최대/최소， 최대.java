import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long num = Long.parseLong(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] numbers = new int[arr.length];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}

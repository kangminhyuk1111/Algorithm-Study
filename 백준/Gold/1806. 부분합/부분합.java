import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int S = Integer.parseInt(inputs[1]);

        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int end = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE; // 초기값을 최대값으로 설정

        while (start < N) {
            // 부분합이 S보다 작고 end가 범위 내에 있다면 end를 증가
            if (sum < S && end < N) {
                sum += A[end++];
            } 
            // 그 외의 경우(부분합이 S 이상이거나 end가 범위를 벗어난 경우) start를 증가
            else {
                // 현재 부분합이 S 이상인 경우 길이 갱신
                if (sum >= S) {
                    minLength = Math.min(minLength, end - start);
                }
                sum -= A[start++];
            }
        }

        // 결과 출력 (불가능한 경우 0 출력)
        if (minLength == Integer.MAX_VALUE) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(minLength));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
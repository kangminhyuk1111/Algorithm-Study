import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        Integer num = Integer.parseInt(inputs[1]);
        String[] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        // 딱 하나의 반복문만 사용
        for(int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) < num) {
                sb.append(arr[i]).append(" ");  // 각 숫자 뒤에 공백 추가
            }
        }

        bw.write(sb.toString().trim());  // 마지막 공백 제거를 위한 trim() 사용
        bw.flush();
        bw.close();
        br.close();
    }
}
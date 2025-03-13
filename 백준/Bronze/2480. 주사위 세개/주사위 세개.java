import java.io.*;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inputs = reader.readLine().split(" ");  // 오타 수정: spllit -> split
        
        Integer a = Integer.parseInt(inputs[0]);
        Integer b = Integer.parseInt(inputs[1]);
        Integer c = Integer.parseInt(inputs[2]);
        
        Integer result = 0;
        
        // 1. 같은 눈이 3개가 나오는 경우
        if(a == b && b == c) {
            result = 10000 + (a * 1000);
        }
        // 2. 같은 눈이 2개만 나오는 경우
        else if(a == b || a == c) {
            result = 1000 + (a * 100);
        }
        else if(b == c) {
            result = 1000 + (b * 100);
        }
        // 3. 모두 다른 눈이 나오는 경우
        else {
            int max = Math.max(Math.max(a, b), c);
            result = max * 100;
        }
        
        writer.write(result.toString());
        writer.flush();
        writer.close();
        reader.close();
    }
}
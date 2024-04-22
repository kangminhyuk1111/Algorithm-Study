import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[N+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 1; i <= N; i++){
            arr[i] += Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);

        int startIndex = 1; // 1
        int endIndex = N; // 6
        int count = 0;

        while (startIndex != endIndex){
            if(arr[startIndex] + arr[endIndex] == M){
                count++;
                startIndex--;
                endIndex--;
            } else if (arr[startIndex] + arr[endIndex] < M){
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > M){
                endIndex--;
            }
        }

        System.out.println(count);
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int N = Integer.parseInt(br.readLine());
        final int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int item = Integer.parseInt(br.readLine());
            arr[i] = item;
        }

        // bubbleSort(arr);
        selectionSort(arr);

        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void bubbleSort(final int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void selectionSort(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;  // 최소값의 인덱스를 저장

            // 최소값 찾기
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 최소값을 현재 위치와 교환
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
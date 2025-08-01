public class Main {
 
    public static void main(String[] args) {
        int[] arr = new int[10000]; // { 0,0,0,0,0,0,0...}
 
        for (int i = 0; i < 10000; i++) {
            int num = d(i + 1); // 1부터 함수에 넣어본다.
 
            if (num <= 10000) { // 10000 이하의 수 중에서
                arr[num - 1] = 1; // 생성자를 가지고 있는 경우 그 (수-1)를 인덱스로 하여 1 입력
            }
 
        }
        for (int i = 0; i < 10000; i++) {
            if (arr[i] == 0) { // 생성자를 가지고 있지 않은 경우
                System.out.println(i + 1);
            }
        }
 
    }
 
    public static int d(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10; // 일의 자리 수를 더해준다.
            n = n / 10; // 자릿수를 줄여준다.
        }
        return sum;
    }
 
}

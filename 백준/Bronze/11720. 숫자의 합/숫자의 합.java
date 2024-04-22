import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String sNum = sc.next();
        sc.close();

        char[] charArray = sNum.toCharArray();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += charArray[i] - '0';
        }

        System.out.println(sum);

    }
}
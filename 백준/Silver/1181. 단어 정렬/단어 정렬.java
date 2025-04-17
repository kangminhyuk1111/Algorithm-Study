import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            final String str = br.readLine();
            set.add(str);
        }

        List<String> words = new ArrayList<>(set);

        words.sort(new Comparator<String>() {
            @Override
            public int compare(final String s1, final String s2) {
                // 1. 길이가 짧은 것부터
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                // 2. 길이가 같으면 사전 순으로
                return s1.compareTo(s2);
            }
        });

        for (String str : words) {
            bw.write(str + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
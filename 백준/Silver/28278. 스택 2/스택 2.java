import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final IntegerStack stack = new IntegerStack(bw);

        final int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            stack.command(br.readLine());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static class IntegerStack {
        List<Integer> stack = new ArrayList<>();
        BufferedWriter bw;

        public IntegerStack(BufferedWriter bw) {
            this.bw = bw;
        }

        public void command(String item) throws IOException {
            String[] inputs = item.split(" ");
            int command = Integer.parseInt(inputs[0]);

            switch (command) {
                case 1:
                    int number = Integer.parseInt(inputs[1]);
                    stack.add(number);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        int removed = stack.remove(stack.size() - 1);
                        bw.write(removed + "\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case 5:
                    if(stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.get(stack.size() - 1) + "\n");
                    }
                    break;
            }
        }
    }
}
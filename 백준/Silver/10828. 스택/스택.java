import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        final CustomStack customStack = new CustomStack(bw);
        for (int i = 0; i < N; i++) {
            customStack.command(br.readLine());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static class CustomStack {
        List<Integer> stack = new ArrayList<>();
        BufferedWriter bw;

        public CustomStack(final BufferedWriter bw) {
            this.bw = bw;
        }

        void command(String input) throws IOException {
            String[] inputs = input.split(" ");

            switch (inputs[0]) {
                case "push":
                    final int value = Integer.parseInt(inputs[1]);
                    stack.add(value);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        final int poppedValue = stack.remove(stack.size() - 1);
                        bw.write(poppedValue+"\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        final int topVal = stack.get(stack.size() - 1);
                        bw.write(topVal+"\n");
                    }
                    break;
            }
        }
    }
}
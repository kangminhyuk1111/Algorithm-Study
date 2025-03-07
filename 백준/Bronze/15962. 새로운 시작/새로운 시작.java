import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        writer.write("파이팅!!");
        writer.flush();
    }
}

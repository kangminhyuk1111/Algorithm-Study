import java.io.*;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer length = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= length; i++) {
            String[] inputs = reader.readLine().split(" ");
            Integer a = Integer.parseInt(inputs[0]);
            Integer b = Integer.parseInt(inputs[1]);
            
            sb.append("Case #").append(i).append(": ")
              .append(a).append(" + ").append(b).append(" = ")
              .append(a+b).append("\n");
        }
        
        writer.write(sb.toString());
        writer.flush();
        writer.close();
        reader.close();
    }
}
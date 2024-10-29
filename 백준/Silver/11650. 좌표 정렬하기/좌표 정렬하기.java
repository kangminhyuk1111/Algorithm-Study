import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            final int reps = Integer.parseInt(br.readLine());
            final List<Point> points = new ArrayList<>();

            for (int i = 0; i < reps; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                points.add(new Point(x, y));
            }

            points.sort(Comparator.comparingInt((Point p) -> p.x)
                    .thenComparingInt(p -> p.y));

            for (Point point : points) {
                bw.write(point.toString());
                bw.write("\n");
            }

            bw.flush();
        }
    }
}

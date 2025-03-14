import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Map<String, Double> rank = new HashMap<>();
        setUpRank(rank);
        double totalGradePoints = 0;
        double totalCredits = 0;
        
        for(int i = 0; i < 20; i++) {
            String[] inputs = br.readLine().split(" ");
            String subjectName = inputs[0];
            double credit = Double.parseDouble(inputs[1]);
            String grade = inputs[2];
            
            // P 등급은 계산에서 제외
            if (grade.equals("P")) {
                continue;
            }
            
            Double gradePoint = rank.get(grade);
            totalGradePoints += credit * gradePoint;
            totalCredits += credit;
        }
        
        // 전공평점 계산
        double majorGPA = totalGradePoints / totalCredits;
        
        bw.write(String.valueOf(majorGPA));
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void setUpRank(Map<String, Double> rank) {
        rank.put("A+", 4.5);
        rank.put("A0", 4.0);
        rank.put("B+", 3.5);
        rank.put("B0", 3.0);
        rank.put("C+", 2.5);
        rank.put("C0", 2.0);
        rank.put("D+", 1.5);
        rank.put("D0", 1.0);
        rank.put("F", 0.0);
    }
}
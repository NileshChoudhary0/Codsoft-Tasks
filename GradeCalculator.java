import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;
        System.out.println("Enter marks out of 100");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double avg = totalMarks / numSubjects;

        String grade;
        if (avg >= 95){
            grade = "A+";
        }
        else if (avg >= 90){
            grade = "A";
        }
        else if (avg >= 85){
            grade = "B+";
        }
        else if (avg >= 80){
            grade = "B";
        }
        else if (avg >= 70){
            grade = "C";
        } 
        else if (avg >= 60){
            grade = "D";
        }
        else if (avg >=40){
            grade = "P";
        }
        else {
            grade = "F";
        }

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

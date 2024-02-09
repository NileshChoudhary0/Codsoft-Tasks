import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        int questionTimeLimitSeconds = 10;

        String[] questions = {
                "What is Computer Memory called?",
                "What is the name of our Galaxy?",
                "Who gave you this Internship opportunity?"
        };

        String[][] options = {
                {"A. HDD", "B. SSD", "C. RAM", "D. ROM"},
                {"A. Earth", "B. Samsung Galaxy", "C. Sun", "D. Milky Way"},
                {"A. Codsoft", "B. Teacher", "C. College", "D. University"}
        };

        char[] answers = {'C', 'D', 'A'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            TimerTask task = new TimerTask() {
            
                public void run() {
                    System.out.println("\nTime's up!");
                    System.out.println("Before moving to next question just try to guess the answer");
                }
            };

            // Timer 
            timer.schedule(task, questionTimeLimitSeconds * 1000);

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            task.cancel();


            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println("-------------------------");
        }

        timer.cancel(); 

        System.out.println("Quiz ended!");
        System.out.println("Your final score: " + score + "/" + questions.length);

        if(score>2) {
            System.out.println("Nice Job!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}

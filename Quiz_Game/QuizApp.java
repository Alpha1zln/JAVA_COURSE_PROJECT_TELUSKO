import java.util.*;

// Main quiz logic
public class QuizApp {
    private Scanner sc = new Scanner(System.in);
    private QuestionBank bank = new QuestionBank();

    // Start quiz for learner
    public void startQuiz(String topic) {
        List<Question> questions = bank.getQuestions(topic);

        if (questions.isEmpty()) {
            System.out.println("No questions found for this topic.");
            return;
        }

        int score = 0; int countQues = 0;
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            countQues++;
            
            // Display question
            System.out.println("\nQ" + (i + 1) + ": " + q.getQuestionText());

            // Display options (1-based indexing)
            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            // Take user answer
            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt() - 1; // convert to 0-based

            if (ans == q.getCorrectAnswerIndex()) {
                System.out.println("Result: Correct!");
                score++;
            } else {
                System.out.println("Result: Wrong! And Correct answer: " + 
                                   options[q.getCorrectAnswerIndex()]);
            }

            // After every 5 questions, ask to continue
            if ((i + 1) % 5 == 0 && (i + 1) < questions.size()) {
                System.out.print("Do you want to continue? (y/n): ");
                String cont = sc.next();
                if (cont.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
        System.out.println("\nYour final score: " + score + "/" + countQues);
        double percent = (score * 100.0) / countQues;
        System.out.printf("Percentage: %.2f%%\n", percent);

            // Performance messages
            if(percent == 100) {
                System.out.println("You played Excellent! You Rock");
            } else if (percent >= 90) {
                System.out.println("You played Superb!");
            } else if (percent >= 80) {
                System.out.println("You played Very Good! ");
            } else if (percent >= 70) {
                System.out.println("You played Good! ");
            } else if (percent >= 60) {
                System.out.println("You played Nice! ");
            } else {
                System.out.println("You played Fine, work harder!");
            }
    }

    // Admin mode to add questions
    public void adminMode() {
        System.out.println("\n--- Admin Mode ---");
        System.out.print("Enter topic (Java/DSA/Core/Cpp): ");
        String topic = sc.next();

        sc.nextLine(); // consume newline
        System.out.print("Enter question text: ");
        String qText = sc.nextLine();

        String[] options = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter option " + (i + 1) + ": ");
            options[i] = sc.nextLine();
        }

        System.out.print("Enter correct option number (1-4): ");
        int correct = sc.nextInt() - 1;

        bank.addQuestion(topic, new Question(qText, options, correct));
        System.out.println("Question added successfully!");
    }
}

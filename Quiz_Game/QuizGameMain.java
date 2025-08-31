// // Just runs the quiz game
// import java.util.*;

// public class QuizGameMain {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         QuizApp app = new QuizApp();

//         // System.out.print("Are you Admin or Learner? ");
//         // String role = sc.next();

//         // if (role.equalsIgnoreCase("Admin")) {
//         //     app.adminMode();
//         // } else {
//             System.out.println("Let's Play Quiz Game!");
//             System.out.print("Choose topic (Java/DSA/Core/Cpp): ");
//             String topic = sc.next().toLowerCase();
//             app.startQuiz(topic);
//         //}

//         sc.close();
//     }
// }



// Just runs the quiz game
import java.util.*;

public class QuizGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizApp app = new QuizApp();

        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Let's Play Quiz Game!");
            System.out.print("Choose topic (Java/DSA/Core/Cpp): ");
            String topic = sc.next().toLowerCase();

            app.startQuiz(topic);

            System.out.print("Do you want to play another game? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                playAgain = false;
            }
            System.out.println("-----------------------------------");
        }

        System.out.println("Thanks for playing! Goodbye");
        sc.close();
    }
}

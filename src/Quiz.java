import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Quiz {
    // List to store all the trivia questions
    private List<Question> questions;

    public Quiz() {
        // Initialize the questions list
        questions = new ArrayList<>();
        // Load questions into the list
        loadQuestions();
    }

    private void loadQuestions() {
        // Add questions to the list
        questions.add(new Question("What is the name of the first boss in Dark Souls?", new String[] {"Asylum Demon", "Bell Gargoyle", "Capra Demon", "Taurus Demon"}, 0, "Easy"));
        questions.add(new Question("Who is the NPC that offers pyromancy training?",
                new String[] {"Laurentius of the Great Swamp", "Griggs of Vinheim", "Logan the Sorcerer", "Dusk of Oolacile"},
                0, "Medium"));
        questions.add(new Question("What is the true name of the character known as 'Solaire of Astora'?",
                new String[] {"Solaire", "Oscar", "Knight of Astora", "Gwyn"},
                1, "Hard"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DARK SOULS TRIVIA");
        System.out.println("Select Difficulty (Easy, Medium, or Hard): ");

        String difficulty = scanner.nextLine();

        List<Question> selectedQuestions = new ArrayList<>();

        // Filter questions based on difficulty
        for (Question question : questions) {
            if (question.getDifficulty().equalsIgnoreCase(difficulty)) {
                selectedQuestions.add(question);
            }
        }

        for (Question question : selectedQuestions) {
            // Print question text
            System.out.println(question.getQuestionText());

            // Get options for the question
            String[] options = question.getOptions();

            // Loop through and print each option
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();  // Create a Quiz object
        quiz.start();  // Start the quiz
    }
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    // List to store all the trivia questions
    private List<Question> questions;
    int score;
    int lives = 3;

    public Quiz() {
        // Initialize the questions list
        questions = new ArrayList<>();
        // Load questions into the list
        loadQuestions();
    }

    private void loadQuestions() {
        // Add questions to the list
        questions.add(new Question("What is the name of the first boss in Dark Souls?",
                new String[]{"Asylum Demon", "Bell Gargoyle", "Capra Demon", "Taurus Demon"}, 0, "Easy"));
        questions.add(new Question("Who is the main character in Dark Souls 1?",
                new String[]{"The Chosen Undead", "The Bearer of the Curse", "The Ashen One", "The Unkindled"}, 0, "Easy"));
        questions.add(new Question("What is the name of the starting area in Dark Souls 1?",
                new String[]{"Firelink Shrine", "Undead Burg", "Northern Undead Asylum", "Anor Londo"}, 2, "Easy"));
        questions.add(new Question("What item do you need to ring the first Bell of Awakening?",
                new String[]{"Master Key", "Drake Sword", "Homeward Bone", "Nothing"}, 3, "Easy"));
        questions.add(new Question("Who is the blacksmith located in the Undead Parish?",
                new String[]{"Vamos", "Andre of Astora", "Rickert of Vinheim", "Giant Blacksmith"}, 1, "Easy"));
        questions.add(new Question("What is the name of the covenant you join by speaking to Kingseeker Frampt?",
                new String[]{"Warriors of Sunlight", "Darkwraiths", "Path of the Dragon", "Way of White"}, 3, "Easy"));
        questions.add(new Question("What type of creature is Sif?",
                new String[]{"Dragon", "Giant", "Wolf", "Demon"}, 2, "Easy"));
        questions.add(new Question("Which item is used to kindle bonfires beyond the initial level?",
                new String[]{"Humanity", "Soul of a Hero", "Estus Flask", "Homeward Bone"}, 3, "Easy"));
        questions.add(new Question("Who is the final boss of Dark Souls 1?",
                new String[]{"Nito", "Gwyn, Lord of Cinder", "Seath the Scaleless", "Manus, Father of the Abyss"}, 0, "Easy"));
        questions.add(new Question("What is the name of the hidden area where you can fight the boss Gwyndolin?",
                new String[]{"The Painted World of Ariamis", "New Londo Ruins", "Darkroot Garden", "The Duke's Archives"}, 0, "Easy"));


        questions.add(new Question("Who is the NPC that offers pyromancy training?",
                new String[]{"Laurentius of the Great Swamp", "Griggs of Vinheim", "Logan the Sorcerer", "Dusk of Oolacile"},
                0, "Medium"));
        questions.add(new Question("What is the true name of the character known as 'Solaire of Astora'?",
                new String[]{"Solaire", "Oscar", "Knight of Astora", "Gwyn"},
                1, "Hard"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------DARK SOULS TRIVIA-------------------------------------------------");
        System.out.println("Welcome Chosen Undead! How much can you remember from your adventures through the Kingdom of Lordran?");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("                    Determine a Difficulty (Easy, Medium, or Hard):                   ");

        String difficulty = scanner.nextLine();

        System.out.println("      To help you through your journey, take this Estus Flask, it has 3 charges. Don't go hollow!");

        System.out.println("                                         | |");
        System.out.println("                                        /~~~\\");
        System.out.println("                                       |     |");
        System.out.println("                                       |     |");
        System.out.println("                                        \\___/");

        System.out.println("-----------------------------------------------------------------------------------------------------");
        // Initialize array of questions
        List<Question> selectedQuestions = new ArrayList<>();

        // Filter questions based on difficulty (Type variable : collection)
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

            System.out.println("----------------------------------------------------------------------------------------------------");
            int answer = scanner.nextInt();
            if (answer - 1 == question.getCorrectOptionIndex()) {
                score += 10;
                System.out.println("| Souls: + " + score + " |");
            }
            if (answer - 1 != question.getCorrectOptionIndex() && lives == 3) {
                lives --;
                System.out.println("             You take a sip of your Estus Flask, leaving 2 charges remaining.");
                System.out.println("                                         | |");
                System.out.println("                                        /   \\");
                System.out.println("                                       |~~~~~|");
                System.out.println("                                       |     |");
                System.out.println("                                        \\___/");
                System.out.println("----------------------------------------------------------------------------------------------------");

            } else if (answer - 1 != question.getCorrectOptionIndex() && lives == 2) {
                lives --;
                System.out.println("             You take a sip of your Estus Flask, leaving 1 charge remaining.");
                System.out.println("                                         | |");
                System.out.println("                                        /   \\");
                System.out.println("                                       |     |");
                System.out.println("                                       |~~~~~|");
                System.out.println("                                        \\___/");
                System.out.println("----------------------------------------------------------------------------------------------------");
            } else if (answer - 1 != question.getCorrectOptionIndex() && lives == 1) {
                lives --;
                System.out.println("             You take a sip of your Estus Flask, leaving 0 charges remaining.");
                System.out.println("                                         | |");
                System.out.println("                                        /   \\");
                System.out.println("                                       |     |");
                System.out.println("                                       |     |");
                System.out.println("                                        \\___/");
                System.out.println("----------------------------------------------------------------------------------------------------");
            } else if (answer - 1 != question.getCorrectOptionIndex() && lives == 0) {
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("                                               YOU DIED");
                System.out.println("----------------------------------------------------------------------------------------------------");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();  // Create a Quiz object
        quiz.start();  // Start the quiz
    }
}



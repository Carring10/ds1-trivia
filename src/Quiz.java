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

        // Easy Questions:
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

        // Medium Questions:
        questions.add(new Question("Who is the NPC that offers pyromancy training?",
                new String[]{"Laurentius of the Great Swamp", "Griggs of Vinheim", "Logan the Sorcerer", "Dusk of Oolacile"},
                0, "Medium"));
        questions.add(new Question("Which item is required to access The Duke's Archives?",
                new String[]{"Crest Key", "Archive Tower Giant Cell Key", "The Broken Pendant", "Lordvessel"},
                3, "Medium"));
        questions.add(new Question("What is the name of the giant blacksmith in Anor Londo?",
                new String[]{"Andre", "Gough", "Domhnall", "Giant Blacksmith"},
                3, "Medium"));
        questions.add(new Question("Which covenant is dedicated to helping other players in co-op?",
                new String[]{"Gravelord Servant", "Forest Hunter", "Way of White", "Warriors of Sunlight"},
                3, "Medium"));
        questions.add(new Question("What type of weapon is the 'Drake Sword' considered?",
                new String[]{"Greatsword", "Straight Sword", "Dagger", "Axe"},
                1, "Medium"));
        questions.add(new Question("Which area is the boss 'Quelaag' found in?",
                new String[]{"Blighttown", "Undead Parish", "Sen's Fortress", "Darkroot Garden"},
                0, "Medium"));
        questions.add(new Question("What is the primary stat that increases pyromancy damage?",
                new String[]{"Faith", "Intelligence", "Strength", "Dexterity"},
                1, "Medium"));
        questions.add(new Question("Which item is used to invade another player's world as a red phantom?",
                new String[]{"Cracked Red Eye Orb", "Black Separation Crystal", "White Sign Soapstone", "Blue Eye Orb"},
                0, "Medium"));
        questions.add(new Question("Who is the knight that helps the player in Undead Burg if rescued?",
                new String[]{"Solaire of Astora", "Knight Lautrec", "Siegmeyer of Catarina", "Knight of Carim"},
                0, "Medium"));
        questions.add(new Question("What is the main theme of the Painted World of Ariamis?",
                new String[]{"Snow and Ice", "Lava and Fire", "Swamp and Poison", "Forests and Trees"},
                0, "Medium"));

        // Hard Questions:
        questions.add(new Question("What is the true name of the character known as 'Solaire of Astora'?",
                new String[]{"Solaire", "Oscar", "Knight of Astora", "Gwyn"},
                1, "Hard"));
        questions.add(new Question("What is the true identity of the boss Gwyndolin?",
                new String[]{"The firstborn son of Gwyn", "The daughter of Seath", "The Moon God", "The youngest son of Gwyn"},
                3, "Hard"));
        questions.add(new Question("Which ring grants increased poise but reduces stamina recovery speed?",
                new String[]{"Ring of Favor and Protection", "Havel's Ring", "Wolf Ring", "Stoneplate Ring"},
                2, "Hard"));
        questions.add(new Question("What is the name of the mysterious NPC that appears after the player rings both Bells of Awakening?",
                new String[]{"Darkstalker Kaathe", "Kingseeker Frampt", "Quelana of Izalith", "Alvina the Cat"},
                1, "Hard"));
        questions.add(new Question("Which weapon can be obtained by cutting off Seath the Scaleless's tail?",
                new String[]{"Moonlight Greatsword", "Dragon King Greataxe", "Drake Sword", "Dragon Slayer Bow"},
                0, "Hard"));
        questions.add(new Question("Which of the following NPCs is *not* found in Firelink Shrine?",
                new String[]{"Oswald of Carim", "Petrus of Thorolund", "Kingseeker Frampt", "Crestfallen Warrior"},
                0, "Hard"));
        questions.add(new Question("How many unique weapon upgrades are required to acquire the Knight's Honor achievement?",
                new String[]{"24", "15", "8", "42"},
                0, "Hard"));
        questions.add(new Question("What is the name of the item that allows you to join the Darkwraith Covenant without betraying the other serpent?",
                new String[]{"Covenant of Artorias", "Darkmoon Seance Ring", "Dark Hand", "Red Eye Orb"},
                1, "Hard"));
        questions.add(new Question("What is the maximum amount of souls required to level up a character in Dark Souls 1?",
                new String[]{"1,200,000", "1,400,000", "1,600,000", "1,800,000"},
                3, "Hard"));
        questions.add(new Question("Which character is associated with the quote: 'You, my friend, are a veritable hero!'?",
                new String[]{"Patches", "Griggs of Vinheim", "Domhnall of Zena", "Logan the Sorcerer"},
                2, "Hard"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------DARK SOULS TRIVIA-------------------------------------------------");
        System.out.println("Welcome Chosen Undead! How much can you remember from your adventures through the Kingdom of Lordran?");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("                    Determine a Difficulty (Easy, Medium, or Hard):                   ");

        String difficulty = scanner.nextLine();

        while (!difficulty.equalsIgnoreCase("easy") && !difficulty.equalsIgnoreCase("medium") && !difficulty.equalsIgnoreCase("hard")) {
            System.out.println("Enter a valid response: Easy, Medium, or Hard");
            difficulty = scanner.nextLine();
        }

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

        // Randomize selected questions
        Collections.shuffle(selectedQuestions);

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



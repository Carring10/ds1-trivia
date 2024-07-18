public class Question {
    // Declare class fields
    private String questionText;
    private String[] options;
    private int correctOptionIndex;
    private String difficulty;

    /**
     * Argument constructor that initializes all fields
     * @param questionText - Text of the trivia question
     * @param options - An array of possible answer options
     * @param correctOptionIndex - Index of the correct answer in the options array
     * @param difficulty - Difficulty level of the question
     */
    public Question(String questionText, String[] options, int correctOptionIndex, String difficulty) {
        // Assigns provided value to class attribute
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
        this.difficulty = difficulty;
    }

    // Mutator methods (getters), allow other parts of the program to access attributes
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
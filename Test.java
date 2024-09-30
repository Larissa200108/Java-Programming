package exercise1;

        import javax.swing.*;
        import java.util.Random;
        import java.util.ArrayList;
        import java.util.Collections;

public class Test {

    // Array of the various questions and their options
    String[][] questions = {
            {"All of the following are data types in java except: \n Answer with A, B, C, or D", "A. String", "B. int", "C. soup", "D. bool"},
            {"Which one here is used to handle exceptions in Java? \n Answer with A, B, C, or D", "A. try-catch", "B. switch", "C. if-else", "D. while"},
            {"Which of these is not a valid keyword in Java? \n Answer with A, B, C, or D", "A. final", "B. var-name", "C. static", "D. public"},
            {"Which one is correct? \n Answer with A, B, C, or D", "A. non-while", "B. do-while", "C. slip-while", "D. no-yes and yes"},
            {"Which of the following is not a loop structure? \n Answer with A, B, C, or D", "A. for", "B. while", "C. non-while", "D. do-while"}
    };

    // Array of correct answers
    char[] correctAnswers = {'C', 'A', 'B', 'B', 'C'};

    // Variable to track the number of correct answers
    int correctCount = 0;
    int incorrectCount = 0;

    // Method to start the Test
    public void inputAnswer() {
        ArrayList<Integer> questionIndices = new ArrayList<>();
        for (int i = 0; i < questions.length; i++) {
            questionIndices.add(i);
        }
        Collections.shuffle(questionIndices);

        for (int index : questionIndices) {
            // Simulate a question, display it and get the user's answer
            char userAnswer = simulateQuestion(index);

            // Check if the answer is correct and provide message
            checkAnswer(index, userAnswer);
        }

        // At the end, display the total number of correct answers and the percentage
        int totalQuestions = questions.length;
        double percentage = (double) correctCount / totalQuestions * 100;

        JOptionPane.showMessageDialog(null, "You answered " + correctCount + " out of " + totalQuestions +
                " questions correctly.\nYour score: " + percentage + "%.");

        // Display a closing message based on the performance
        if (percentage == 100) {
            JOptionPane.showMessageDialog(null, "Excellent! Perfect score!");
        } else if (percentage >= 60) {
            JOptionPane.showMessageDialog(null, "Good job! You passed the test!");
        } else {
            JOptionPane.showMessageDialog(null, "Better luck next time! Keep practicing!");
        }
    }

    // Method to simulate a question and take input
    public char simulateQuestion(int questionIndex) {
        // Shuffle the answers for a random display
        String[] options = {
                questions[questionIndex][1],
                questions[questionIndex][2],
                questions[questionIndex][3],
                questions[questionIndex][4]
        };
        ArrayList<String> optionList = new ArrayList<>();
        Collections.addAll(optionList, options);
        Collections.shuffle(optionList);

        // Create a string for the question and options
        StringBuilder questionDisplay = new StringBuilder(questions[questionIndex][0] + "\n");
        for (String option : optionList) {
            questionDisplay.append(option).append("\n");
        }

        // Get the user's answer using a dialog
        String userAnswer = JOptionPane.showInputDialog(null, questionDisplay.toString());

        // Validate if the user did not enter an answer or canceled the Test
        if (userAnswer == null || userAnswer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No answer provided. Skipping...");
            return ' ';
        }

        return Character.toUpperCase(userAnswer.trim().charAt(0));
    }

    // Method to check the user's answer
    public void checkAnswer(int questionIndex, char userAnswer) {
        char correctAnswer = correctAnswers[questionIndex];

        if (userAnswer == correctAnswer) {
            correctCount++;
            generateMessage(true); // Generate a congratulatory message
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was: " + correctAnswer);
            generateMessage(false); // Generate an encouraging message
        }
    }

    // Method to generate a random message for correct or incorrect answers
    public void generateMessage(boolean isCorrect) {
        Random random = new Random();
        int randomIndex = random.nextInt(4);

        // Switch statement to issue random messages based on correctness
        switch (randomIndex) {
            case 0:
                JOptionPane.showMessageDialog(null, isCorrect ? "Excellent!" : "Better luck next time.");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, isCorrect ? "Good!" : "Try harder.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, isCorrect ? "Keep up the good work!" : "Don't give up!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, isCorrect ? "Nice work!" : "Keep trying.");
                break;
        }
    }

    // Main method to run the Test
    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}

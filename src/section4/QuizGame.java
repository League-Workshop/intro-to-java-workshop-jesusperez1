package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;

		// 2. Ask the user a question
		String question = JOptionPane.showInputDialog("What's the best bear?");
		// 3. Use an if statement to check if their answer is correct
		if (question.equalsIgnoreCase("Brown bear")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		String question2 = JOptionPane.showInputDialog("What color is the ocean?");
		if (question2.equalsIgnoreCase("Blue")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		String question3 = JOptionPane.showInputDialog("What is 4x4/4?");

		if (question3.equalsIgnoreCase("4")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, score);
	}
}

package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello");
		String input = JOptionPane.showInputDialog("Want to play a game?");
		JOptionPane.showMessageDialog(null, input);
		if (input.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Let's play");

		} else {
			JOptionPane.showMessageDialog(null, "We shall still play");
		}
	}

}

package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int r = new Random().nextInt(4);
		System.out.println(r);
		// 3. Print out this variable

		// 4. Get the user to enter something that they think is awesome
		String awesome = JOptionPane.showInputDialog("Enter something that is awesome");
		// 5. If the random number is 0
		if (r == 0) {
			JOptionPane.showMessageDialog(null, awesome+ "is awesome");
		} else if(r == 1){
			JOptionPane.showMessageDialog(null, "Ok");
			
		}else if (r ==2) {
			JOptionPane.showMessageDialog(null, "Boring");
		}else if (r == 3) {
			JOptionPane.showMessageDialog(null, "Yeet");
		}
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1

		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2

		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3

		// -- write your own answer

	}

}
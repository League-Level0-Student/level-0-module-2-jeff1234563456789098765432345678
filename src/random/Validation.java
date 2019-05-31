//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);
		for (int i = 0; i < 10; i++) {

			// 1. Use each value of randomNumber to give the user a random compliment.
			Random rand = new Random();
			int randomChoice = rand.nextInt(6);
			if (randomChoice == 0) {
				JOptionPane.showMessageDialog(null, "You’re Really Something Special.");
			} else if (randomChoice == 2) {
				JOptionPane.showMessageDialog(null, "I Bet You Make Babies Smile.");

			} else if (randomChoice == 3) {
				JOptionPane.showMessageDialog(null, "You Are The Most Perfect You There Is.");
			} else if (randomChoice == 4) {
				JOptionPane.showMessageDialog(null,
						"You’re Even More Beautiful On The Inside Than You Are On The Outside.");
			} else if (randomChoice == 5) {
				JOptionPane.showMessageDialog(null, "You Are The Most Perfect You There Is.");
			} else {

			}
		}
	}

	// 2. Repeat all the code above 10 times

	// 3. Find someone to test out your program. They will like it :)
}

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_numbers {
	public static void main(String[] args) {

		Random gen = new Random();
		
		for (int i = 0; i < 5; i++) {
			int rand = gen.nextInt(6);
			JOptionPane.showMessageDialog(null,  rand);
		}
	}

}

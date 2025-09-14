package _06_vault;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 * A vault with a secret code
 *
 */
public class Vault {
	public static int secret = new Random().nextInt(1000001);

	/**
	 * Tries to access the vault
	 *
	 * @param guess the code being attempted
	 * @return true if the guess matches the code, false otherwise
	 */
	public boolean tryCode(int guess) {
		return guess == secret;
	}
	public void findCode() {
		Vault vault = new Vault();
		String number = JOptionPane.showInputDialog("Pick a number");
		int check= Integer.parseInt(number);
		vault.tryCode(check);
		while (secret!=check) {
			check++;
			System.out.println(check);
		}
		JOptionPane.showMessageDialog(null, "Your agent craked the code");
	}
}

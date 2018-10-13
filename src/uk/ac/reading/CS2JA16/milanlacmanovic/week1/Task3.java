package uk.ac.reading.CS2JA16.milanlacmanovic.week1;

import javax.swing.JOptionPane;

public class Task3 {
	public static void main(String[] args) {
		String initials = "";
		String text = JOptionPane.showInputDialog(null, "Input FullName:");
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				initials = initials + String.valueOf(text.charAt(i));
			}
		}
		System.out.printf("Initials: " + initials);
		JOptionPane.showMessageDialog(null, "Initials: " + initials);
	}
}

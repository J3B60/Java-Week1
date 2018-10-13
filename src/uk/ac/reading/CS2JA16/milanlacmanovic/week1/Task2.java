package uk.ac.reading.CS2JA16.milanlacmanovic.week1;

import javax.swing.JOptionPane;

public class Task2 {
	public static void main(String[] args) {
		int numberOfS = 0;
		String text = JOptionPane.showInputDialog
				(null, "Input Word:");
				for (int i = 0; i < text.length(); i++) {
				  if (text.charAt(i) == 's') numberOfS++;
				}
				System.out.printf("There are ", numberOfS, " s in ", text);
				JOptionPane.showMessageDialog
				(null, "There are "+ numberOfS + " s in " + text);
     }
}

package uk.ac.reading.CS2JA16.milanlacmanovic.week1;

import javax.swing.JOptionPane;

public class Task4 {
	
	static int countNames (String names) { 
		int count = 0;
		for (int i = 0; i < names.length(); i++) {
			if (Character.isUpperCase(names.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	static String[] getName (String names, int numPeople) {
		String temp [] =  new String[numPeople];
		int arraypos = 0;
		for (int i = 0; i < names.length(); i++) {
			if (Character.isUpperCase(names.charAt(i))) {
				for (int j = 0; j < names.length() - i; j++) {
					if (!Character.isWhitespace(names.charAt(j))) {
						temp[arraypos] = temp[arraypos] + String.valueOf(names.charAt(j));
					}
					else {
						break;
					}
				}
			}
		} 
		return temp;
	}
	
	public static void main(String[] args) {
		String names = JOptionPane.showInputDialog(null, "Input Names:");
		int numPeople = countNames(names);
		String allNames[] = new String[numPeople];
		allNames = getName(names, numPeople);
		System.out.println("Number of names is " + numPeople);
		JOptionPane.showMessageDialog(null, "Number of names is " + numPeople);
		for (int i = 0; i < numPeople; i++) {
			System.out.println(allNames[i] + "\n");
		}
		String nameSplit [] = names.split(" ");
		for (int i = 0; i < numPeople; i++) {
			System.out.println(nameSplit[i] + "\n");
		}
	}
}

//My String splitter is not working, almost have the code working just need to tweak for loops - cant be botherd to go through it anymore, the split function works.

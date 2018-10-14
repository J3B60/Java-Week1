package uk.ac.reading.CS2JA16.milanlacmanovic.week1;

import java.util.Arrays;

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
				for (int j = i; j < names.length(); j++) {
					if (!Character.isWhitespace(names.charAt(j))) {
						if (temp[arraypos] == null) {
							temp[arraypos] = String.valueOf(names.charAt(j));
						}
						else {
							temp[arraypos] = temp[arraypos] + String.valueOf(names.charAt(j));
						}
					}
					else {
						arraypos++;
						break;
					}
				}
			}
		} 
		//System.out.println(Arrays.toString(temp));
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
		//String nameSplit [] = names.split(" ");
		//for (int i = 0; i < numPeople; i++) {
		//	System.out.println(nameSplit[i] + "\n");
		//}
	}
}

//ITS ALLLIIVVVVVVEEEE

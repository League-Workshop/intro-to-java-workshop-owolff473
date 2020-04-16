package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String one = JOptionPane.showInputDialog(null, "What is the first color of the rainbow?");
		// 3.  Use an if statement to check if their answer is correct
		if (one.equals ("red")) {
		// 4.  if the user's answer was correct, add one to their score 
		score ++;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String two = JOptionPane.showInputDialog(null, "What is the first letter of the alphabet? (lowercase letter");
		if (one.equals ("a")) {
		score ++;
		}
		String three = JOptionPane.showInputDialog(null, "and lastly, the 28 point question, what is 1 + 1?");
		if (three.equals ("2")) {
		score += 28;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}
}

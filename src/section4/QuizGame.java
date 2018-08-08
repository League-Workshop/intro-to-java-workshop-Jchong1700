package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0; 
		
		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("What is the square root of 25?");
		// 3.  Use an if statement to check if their answer is correct
		if (question.equalsIgnoreCase("5")) {score = score + 1; }
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String question2 = JOptionPane.showInputDialog("Who is the Teenage Mutant Ninja Turtles' master ?");
		
		// 6.  After all the questions have been asked, print the user's score 
		if (question2.equalsIgnoreCase("Splinter")) {score = score + 1; }
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		
String question3 = JOptionPane.showInputDialog("What is 144/12 ?");
		
		if (question3.equalsIgnoreCase("12")) {score = score + 1; }
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		
String question4 = JOptionPane.showInputDialog("Who is the best Teenage Mutant Ninja Turtle ?");
		
		if (question4.equalsIgnoreCase("Raphael")) {score = score + 1; }
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		
		JOptionPane.showMessageDialog(null, "Your final score is " + score );
		
	}
}

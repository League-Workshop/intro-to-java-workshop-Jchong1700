package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int randomNumber = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(randomNumber);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("What's something you think is awesome?");
	// 5. If the random number is 0
if (randomNumber==0) {JOptionPane.showMessageDialog(null, "You're right! Awesome!");}
	

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (randomNumber==1) {JOptionPane.showMessageDialog(null, "It's okay...");}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if (randomNumber==2) {JOptionPane.showMessageDialog(null, "Meh...Pretty boring...");}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if (randomNumber==3){JOptionPane.showMessageDialog(null, "Ugh, gross...");}
	// -- write your own answer
}
}



package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
    public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
    int random = new Random().nextInt(4) ;
	// 3. Print out this variable
    System.out.println(random);
	// 4. Get the user to enter something that they think is awesome
    JOptionPane.showInputDialog(null, "what do you think is awesome?");
	// 5. If the random number is 0
    if (random== (0)) {
	// -- tell the user whatever they entered is awesome!
    JOptionPane.showMessageDialog(null, "That is awesome!"); }
	// 6. If the random number is 1
    if (random== (1)) {
	// -- tell the user whatever they entered is ok.
    JOptionPane.showMessageDialog(null, "that's just okay."); }
	// 7. If the random number is 2
    if (random== (2)) {
	// -- tell the user whatever they entered is boring.
    JOptionPane.showMessageDialog(null, "That's boring!"); }
	// 8. If the random number is 3
    if (random== (3)) {
	// -- write your own answer
    JOptionPane.showMessageDialog(null, "Wow!"); }
}
}



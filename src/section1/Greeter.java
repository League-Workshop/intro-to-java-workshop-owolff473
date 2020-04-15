package section1;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "what is your name?") ;
	
	JOptionPane.showMessageDialog(null, "Hello " + name);

	if (name.equals("Olivia")) {
	   JOptionPane.showMessageDialog(null, "awesome name!");
	}
	else{
	JOptionPane.showMessageDialog(null, "Welcome!");
	}
	
  }
}

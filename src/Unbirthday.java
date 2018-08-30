import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String birthday = JOptionPane.showInputDialog("What's your birthday? (mm/dd)");
	if(birthday.equalsIgnoreCase("08/29")) {JOptionPane.showMessageDialog(null, "Happy Birthday!");}
	else{JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday");}
	
}
}

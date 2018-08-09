package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int dragonDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int playerDamage = 0;
		int HealthPotion = 2;
		int lightning = 3;
		int fireball = 3;
		// 6. Delete the slashes at the beginning of the next line.
		while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the battle going until someone's
														// health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String choiceBoard = JOptionPane.showInputDialog("Choose an option! \n <Attack \n <Magic \n <Item \n <Run");
			if (choiceBoard.equalsIgnoreCase("Attack")) {
				String attack = JOptionPane.showInputDialog("Choose an attack! \n <Yell \n <Kick");
				// 9. If they typed in "yell":
				if (attack.equalsIgnoreCase("yell")) {
					dragonDamage = new Random().nextInt(11);
				}

				dragonHealth -= dragonDamage;
				if (attack.equalsIgnoreCase("kick")) {
					dragonDamage = new Random().nextInt(26);
				}
				dragonHealth -= dragonDamage;

				
				playerDamage = new Random().nextInt(36);
				
				playerHealth -= playerDamage;

				JOptionPane.showMessageDialog(null,
						"You attack the dragon with a " + attack + " ,dealing " + dragonDamage + " damage!");
				JOptionPane.showMessageDialog(null,
						"The dragon attacks with fire and claws, dealing " + playerDamage + " damage!");
				JOptionPane.showMessageDialog(null,
						"Dragon's Health " + dragonHealth + "\n Player's Health " + playerHealth);
			}

			if (choiceBoard.equalsIgnoreCase("Item")) {
				String item = JOptionPane.showInputDialog("Items \n <Health Potion : " + HealthPotion);
				if (item.equalsIgnoreCase("Health Potion")) {
					if (HealthPotion > 0) {
						playerHealth += 20;
						HealthPotion -= 1; 	JOptionPane.showMessageDialog(null,
								"Dragon's Health " + dragonHealth + "\n Player's Health " + playerHealth);
						if (HealthPotion == 0) {
							JOptionPane.showMessageDialog(null, "Out of Health Potions!");
						}

						if (playerHealth == 0) {
							JOptionPane.showMessageDialog(null, "The dragon defeats you! You lose!");
						}
						if (playerHealth < 0) {
							JOptionPane.showMessageDialog(null, "The dragon defeats you! You lose!");
						}
						if (choiceBoard.equalsIgnoreCase("Magic")) {
							String magic = JOptionPane.showInputDialog("Choose a Spell! \n <Fireball Tome: 3 "
									+ "\n <Lightning Tome: 3");
							if (lightning>0)
						}
						
						
						
						
						if (dragonHealth == 0) {
							JOptionPane.showMessageDialog(null, "You slay the dragon and take the gold! You win!");
						}
						if (dragonHealth < 0) {
							JOptionPane.showMessageDialog(null, "You slay the dragon and take the gold! You win!");
						}
					
						else {
							if (playerHealth == 0 && dragonHealth == 0) {
								JOptionPane.showMessageDialog(null,
										"You both are critically injured! \n Too hurt to pillage for gold you perish along with the dragon in the dragon's cave ");
							}
						}
					}
				}
			}
		}
	}
}

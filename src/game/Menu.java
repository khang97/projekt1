package game;

import javax.swing.JOptionPane;

public class Menu extends Main{
	
	public static void chooseCharacter() {
		try {
			playerCharacter = Integer
					.parseInt(JOptionPane
					.showInputDialog("Choose your class! \n"
							+ "<MAGE> Mage is a caster who excels at vanquishing his foes from a far with sorcery and intelligence. \n"
							+ "<WARRIOR> Warrior is a mighty brute who gets up close and personal to destroy his enemies with a powerful weapon. \n"));
		} catch (NumberFormatException e) {
			message("You have to choose a class.");
			chooseCharacter();
		}
		
		switch (playerCharacter) {
		
		case 1:
			playerClass = "MAGE";
			health = 35;
			mana = 55;
			armor = 6;
			strength = 2;
			intelligence = 5;
			critical = 5;
			
		case 2:
			playerClass = "WARRIOR";
			health = 50;
			mana = 35;
			armor = 9;
			strength = 6;
			intelligence = 2;
			critical = 5;
		default:
			
			chooseCharacter();
		}
	}
}

package game;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main{
	
	static int playerCharacter;
	static String playerClass = "";
	public static int health;
	public static int mana;
	public static int armor;
	public static int strength;
	public static int intelligence;
	public static int critical;
	public static int xp;
	public static int coins;
	
	public static int first;
	public static int inn;	
	public static int talkInn;
	public static int buy;
	
	public static boolean interactInnkeeper;
	public static boolean interactWiseOldMan;
	public static boolean interactThieves;
	
	public static boolean inventoryOpen;

	public static void main(String[] args) {
	
		message("You wake to a breeze that blows sand into your face. Slowly you "
				+ "open your eyes and start brushing sand off your clothes while "
				+ "wondering who you are.");
	
		chooseCharacter();
	
		message("You wake up in a dry desert. You see a path in the sand, but you "
				+ "can't see where it leads. Everywhere \naround you is sand, but in the distance, "
				+ "off the path, you can see a small oasis.");
		
		first();
			
		message("After walking for a while you suddenly notice three riders on horses "
				+ "approach you from behind. With a sigh \nof relief you wait as "
				+ "they get closer. Minutes later they reach you and ask where you "
				+ "are headed. You tell \nthem you don't remember how you got here "
				+ "and before you get to continue the heat becomes unbearable \nand you "
				+ "pass out and collapse.");
		
		message("You wake up in an inn. The riders who took you there are gone, but you "
				+ "no longer feel thirsty or hungry. \nYou get out of your room and walk "
				+ "to the tavern's main room.");
		
		inn();
		
		
				
	}

	public static ArrayList<String> inventory = new ArrayList();
	
	public static void chooseCharacter() {
		try {
			playerCharacter = Integer
					.parseInt(JOptionPane
					.showInputDialog("Who are you? \n \n"
							+ "<1> MAGE: Mage is a caster who excels at vanquishing his foes from a far with sorcery and intelligence. \n"
							+ "<2> WARRIOR: Warrior is a mighty brute who gets up close and personal to crush his enemies with powerful weapons. \n"));
		}
		catch (NumberFormatException b) {
			message("Make a decision by typing the number of the option you wish to choose!");
			chooseCharacter();
		}
		
		switch (playerCharacter) {
		
		case 1:
			playerClass = "Mage";
			health = 35;
			mana = 55;
			armor = 6;
			strength = 2;
			intelligence = 5;
			critical = 5;
			break;
			
		case 2:
			playerClass = "Warrior";
			health = 50;
			mana = 35;
			armor = 9;
			strength = 6;
			intelligence = 2;
			critical = 5;
			break;
				
		default:
			
			chooseCharacter();
		}
	}
	
	public static void first() {
		try {
			first = Integer
					.parseInt(JOptionPane
					.showInputDialog("What do you do? \n \n"
							+ "<1> Follow the road I woke up on. It has to lead me out of the desert! \n"
							+ "<2> I feel very thirsty, there's water in the oasis and I can wait for help there. \n"));
		}
		catch (NumberFormatException b) {
			message("Make a decision by typing the number of the option you wish to choose!");
			first();
			
		}
	}
	
	public static void inn() {
		try {
			inn = Integer
					.parseInt(JOptionPane
					.showInputDialog("What do you do? \n \n"
							+ "<1> Talk to the Innkeeper behind the counter.\n"
							+ "<2> Talk to the Wise Old Man in the corner.\n"
							+ "<3> Join a group of thieves for some beers.\n"
							+ "<4> Go on an expedition.\n"
							+ "<9> Show stats.\n"
							+ "<0> Open inventory.\n"));
		}
		catch (NumberFormatException b) {
			message("Make a decision by typing the number of the option you wish to choose!");
			inn();
		}
		switch(talkInn) {
		
		case 1:
			interactInnkeeper = false;
			interactInnkeeper = !interactInnkeeper;
			break;
			
		case 2:
			interactWiseOldMan();
			break;
		
		case 3:
			interactThieves();
			break;
			
		case 4:
			exitTavern();
			break;
			
		case 5:
			inventoryOpen = true;
			inventoryOpen();
			break;
		}
	}
	
	public static void inventoryOpen() {
		String list;
		list = inventory.get(0);
		
		for (int i = 1; i < inventory.size(); i++) {
			list = list + "\n" + inventory.get(i);
		}
		
		message(" << Inventory >> \n \n"
				+ "Coins: " + coins + "\nItems: " + list + "\n");
	}
	
	public static void interactInnkeeper() {
		try {
			talkInn = Integer
					.parseInt(JOptionPane
					.showInputDialog("Welcome to my inn, " + playerClass + ". What "
							+ "can I get you? \n \n"
							+ "<1> Some Bread please. [Heals 20 health] - 8 coins. \n"
							+ "<2> Some Water please. [Restores 25 mana] - 10 coins. \n"
							+ "<3> Some Mushroom Soup please. [Restores 20 health and "
							+ "mana] - 20 coins. \n"
							+ "<4> I'm good, thanks. \n"
							+ "Coins: " + coins));
		}
		catch (NumberFormatException b) {
			message("Make a decision by typing the number of the option you wish to choose!");
			interactInnkeeper();
		}
			
		switch (buy) {
			
		case 1:
			if(coins >= 8) {
				inventory.add("Bread");
				coins = coins - 10;
			} else {
				message("You don't have enough to pay for that!");
			}
			message("You bought a loaf of Bread.");
			break;
				
		case 2:
			if(coins >= 10) {
				inventory.add("Water");
				coins = coins - 10;
			} else {
				message("You don't have enough to pay for that!");
			}
			message("You bought a glass of Water.");
			break;
				
		case 3:
			if(coins >= 20) {
				inventory.add("Mushroom Soup");
			coins = coins - 20;
			} else {
				message("You don't have enough to pay for that!");
			}
			message("You bought a bowl of Mushroom Soup.");
			break;
		case 4:
			inn();
			break;
		}
	}

	public static void interactWiseOldMan() {
		if (interactWiseOldMan = true) {
			try {
				talkInn = Integer
						.parseInt(JOptionPane
						.showInputDialog("Welcome to my inn, " + playerClass + ". What "
								+ "can I get you? \n \n"
								+ "<1> Some Bread please. [Heals 20 health] - 8 coins. \n"
								+ "<2> Some Water please. [Restores 25 mana] - 10 coins. \n"
								+ "<3> Some Mushroom Soup please. [Restores 20 health and "
								+ "mana] - 20 coins. \n"
								+ "<4> I'm good, thanks. \n"
								+ "Coins: " + coins));
			}
			catch (NumberFormatException b) {
				message("Make a decision by typing the number of the option you wish to choose!");
				interactInnkeeper();
			}
			
			switch (buy) {
			
			case 1:
				if(coins >= 8) {
					inventory.add("Bread");
					coins = coins - 10;
				} else {
					message("You don't have enough to pay for that!");
				}
				break;
				
			case 2:
				if(coins >= 10) {
					inventory.add("Water");
					coins = coins - 10;
				} else {
					message("You don't have enough to pay for that!");
				}
				break;
				
			case 3:
				if(coins >= 20) {
					inventory.add("Mushroom Soup");
				coins = coins - 20;
				} else {
					message("You don't have enough to pay for that!");
				}
				break;
			}
		}
	}
	
	public static void interactThieves() {
		
	}

	public static void exitTavern() {
		
	}
	
	public static void message(String text) {
		JOptionPane.showMessageDialog(null, text, "Sands of Time", JOptionPane.INFORMATION_MESSAGE);
	}
}

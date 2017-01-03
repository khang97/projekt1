package game;

public class Stats extends Main{
	
	public static void stats() {
		
		message("<< Stats >>"
				+ "\n \n Class: " + playerClass 
				+ "\n Experience: " + xp 
				+ "\n \n Health: " + health 
				+ "\n Mana: " + mana 
				+ "\n Armor: " + armor 
				+ "\n Strength: " + strength 
				+ "\n Intelligence: " + intelligence 
				+ "\n Critical: " + critical);
		
	}

}

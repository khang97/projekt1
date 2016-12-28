package game;

public class Stats extends Main{
	
	public static void stats() {
		
		message(" -STATS-"
				+ "\n \n Class: " + playerCharacter 
				+ "\n Level: " + level  
				+ "\n Experience: " + xp 
				+ "\n \n Health: " + health 
				+ "\n Mana: " + mana 
				+ "\n Armor: " + armor 
				+ "\n Strength: " + strength 
				+ "\n Intelligence: " + intelligence 
				+ "\n Critical: " + critical);
		
	}

}

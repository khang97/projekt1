package game;

public class Inventory extends Main {
	
	public static void  inventoryOpen() {
		String list;
		list = inventory.get(0);
		
		for (int i = 1; i < inventory.size(); i++) {
			list = list + "\n" + inventory.get(i);
		}
		
		message(" << Inventory >> \n \n"
				+ "Coins: " + coins + "\nItems: " + list + "\n");
	}
}

package game;

import java.awt.Color;

import javax.swing.JFrame;
	
public class Window{

	public static void Screen() {
		
		JFrame frame = new JFrame ("RPG");
		frame.pack();
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Screen();
			}
		});
	}
}
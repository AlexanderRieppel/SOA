package datenbasis;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse erstellt ein Fenster mit Hilfe von swing
 * 
 * @author 
 * @version 
 */
public class SOAController extends JFrame {
	public static void main(String[] args) {
		SOAGUI tbp = new SOAGUI();
		JFrame f = new JFrame("XML");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(tbp, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}

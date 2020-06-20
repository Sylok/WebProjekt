package webshop;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class View3 {

	public View3() {

		// Frame
		JFrame window = new JFrame("Produktauswahl");
		window.setSize(1080, 720);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		window.setLocationRelativeTo(null);
		window.setVisible(true);

		// Panels
		JPanel produkt = new JPanel();
		produkt.setLayout(new BorderLayout(0, 30));
		JPanel produktTop = new JPanel();
		produktTop.setLayout(null);
		JPanel produktBottom = new JPanel();
		produktBottom.setLayout(new GridLayout(2, 4, 20, 5));
		JPanel suche = new JPanel();
		suche.setLayout(new BorderLayout());
		JPanel index = new JPanel(new GridLayout(7, 1, 20, 5));
		JPanel suchleer = new JPanel();

		// Labels
		JLabel mashtech = new JLabel("Mashtech ");
		JLabel Produktname = new JLabel("Aux Kabel ");
		JLabel Preis = new JLabel("19.99 CHF ");
		JLabel topKat = new JLabel("Top Kategorien ");
		JLabel leer = new JLabel(" ");
		JLabel leer1 = new JLabel(" ");
		JLabel leer2 = new JLabel(" ");
		JLabel leer3 = new JLabel(" ");
		JLabel leer4 = new JLabel(" ");
		JLabel leer5 = new JLabel(" ");
		JLabel leer6 = new JLabel(" ");
		
		// Textfields
		JTextField search = new JTextField();
		
		// Buttons
		JButton warenkorb = new JButton("Warenkorb");
		JButton image = new JButton(new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\4201.jpg"));
		
		// links
		JLabel link1 = new JLabel("Link 1 ");
		JLabel link2 = new JLabel("Link 2 ");
		JLabel link3 = new JLabel("Link 3 ");
		JLabel link4 = new JLabel("Link 4 ");
		JLabel link5 = new JLabel("Link 5 ");
		JLabel link6 = new JLabel("Link 6 ");
	
		// Fonts
		Font mashtec1 = new Font("SansSerif", Font.BOLD,40);
		Font beliebt1 = new Font("SansSerif", Font.BOLD, 30);
		Font neuheiten1 = new Font("SansSerif", Font.BOLD, 30);


		// JFrame add
		window.add(produkt, BorderLayout.CENTER);
		window.add(suche, BorderLayout.NORTH);
		window.add(index, BorderLayout.WEST);

		// JPanel add
		produkt.add(produktBottom);
		produkt.add(produktTop);

		produktTop.add(warenkorb);
		produktTop.add(image);
		produktTop.add(Produktname);
		produktTop.add(Preis);

		suche.add(suchleer, BorderLayout.EAST);
		suche.add(search, BorderLayout.CENTER);
		suche.add(mashtech, BorderLayout.WEST);

		index.add(link1);
		index.add(link2);
		index.add(link3);
		index.add(topKat);
		index.add(link4);
		index.add(link5);
		index.add(link6);

		window.setVisible(true);

		// customization
		mashtech.setFont(mashtec1);
		produktTop.setPreferredSize(new Dimension(10, 300));
		suchleer.setPreferredSize(new Dimension(200, 10));
		index.setPreferredSize(new Dimension(200, 10));
		mashtech.setPreferredSize(new Dimension(300, 80));
		warenkorb.setSize(250, 35);
		warenkorb.setLocation(482, 321);
		image.setSize(275, 275);
		image.setLocation(125, 81);
		Produktname.setLocation(482, 221);
		Preis.setLocation(482, 253);
	}

	public static void main(String[] args) {
		View3 view3 = new View3();
	}


}
	

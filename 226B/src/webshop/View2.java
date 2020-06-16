package webshop;

import java.awt.*;

import javax.swing.*;
import java.applet.Applet;

public class View2 {

	public View2() {
		// Frame
		JFrame window = new JFrame("Produktauswahl");
		window.setSize(720, 540);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Panels
		JPanel produkt = new JPanel();
		produkt.setLayout(new GridLayout(4, 4));
		JPanel suche = new JPanel();
		suche.setLayout(new BorderLayout());
		JPanel index = new JPanel();
		index.setLayout(new BorderLayout());
		JPanel indexBottom = new JPanel(new GridLayout());
		JPanel indexTop = new JPanel(new GridLayout());

		// Labels
		JLabel mashtech = new JLabel("Mashtech ");
		JLabel beliebt = new JLabel("Beliebt ");
		JLabel neuheiten = new JLabel("Neuheiten ");
		JLabel topKat = new JLabel("Top Kategorien ");
		JLabel leer = new JLabel(" ");
		
		// Textfields
		JTextField search = new JTextField();

		// Buttons
		JButton produkt1 = new JButton();
		JButton produkt2 = new JButton();
		JButton produkt3 = new JButton();
		JButton produkt4 = new JButton();
		JButton produkt5 = new JButton();
		JButton produkt6 = new JButton();
		JButton produkt7 = new JButton();
		JButton produkt8 = new JButton();

		// links
		JLabel link1 = new JLabel("Mashtech ");
		JLabel link2 = new JLabel("Beliebt ");
		JLabel link3 = new JLabel("Neuheiten ");
		JLabel link4 = new JLabel("Mashtech ");
		JLabel link5 = new JLabel("Beliebt ");
		JLabel link6 = new JLabel("Neuheiten ");

		// JFrame add
		window.add(produkt, BorderLayout.CENTER);
		window.add(suche, BorderLayout.NORTH);
		window.add(index, BorderLayout.WEST);

		// JPanel add
		produkt.add(produkt1);
		produkt.add(produkt2);
		produkt.add(produkt3);
		produkt.add(produkt4);
		produkt.add(produkt5);
		produkt.add(produkt6);
		produkt.add(produkt7);
		produkt.add(produkt8);
		produkt.add(beliebt);
		produkt.add(neuheiten);

		suche.add(leer, BorderLayout.EAST);
		suche.add(search, BorderLayout.CENTER);
		suche.add(mashtech, BorderLayout.WEST);

		index.add(indexTop);
		index.add(indexBottom);
		indexBottom.add(topKat);
		indexTop.add(link1);
		indexTop.add(link2);
		indexTop.add(link3);
		indexBottom.add(link4);
		indexBottom.add(link5);
		indexBottom.add(link6);
		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		View2 view2 = new View2();
	}
}

package webshop;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class View5 {
	
	public View5(){
		// Frame
				JFrame window = new JFrame("Produktauswahl");
				window.setSize(1080, 720);
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

				window.setLocationRelativeTo(null);
				window.setVisible(true);

				// Panels
				JPanel produkt = new JPanel();
				produkt.setLayout(new BorderLayout(0, 30));
				JPanel produktTop = new JPanel();
				produktTop.setLayout(new GridLayout(6, 8, 20, 5));
				JPanel produktBottom = new JPanel();
				produktBottom.setLayout(null);
				JPanel suche = new JPanel();
				suche.setLayout(new BorderLayout());
				JPanel index = new JPanel(new GridLayout(7, 1, 20, 5));
				JPanel suchleer = new JPanel();

				// Labels
				JLabel mashtech = new JLabel("Mashtech ");
				JLabel danke = new JLabel("Danke für Ihren einkauf");
				JLabel tag = new JLabel("Wir wünschen Ihnen einen schönen Tag");
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
				JButton einkaufen = new JButton("Weiter einkaufen");
				
				// links
				JLabel link1 = new JLabel("Link 1 ");
				JLabel link2 = new JLabel("Link 2 ");
				JLabel link3 = new JLabel("Link 3 ");
				JLabel link4 = new JLabel("Link 4 ");
				JLabel link5 = new JLabel("Link 5 ");
				JLabel link6 = new JLabel("Link 6 ");

				// images
				
				
				// Fonts
				Font mashtec1 = new Font("SansSerif", Font.BOLD,40);
				Font danke1 = new Font("SansSerif", Font.BOLD, 40);
				Font tag1 = new Font("SansSerif", Font.BOLD, 24);
				

				// JFrame add
				window.add(produkt, BorderLayout.CENTER);
				window.add(suche, BorderLayout.NORTH);
				window.add(index, BorderLayout.WEST);

				// JPanel add

				produkt.add(produktBottom, BorderLayout.CENTER);
				produkt.add(produktTop, BorderLayout.NORTH);
							
				produktTop.add(danke);
				produktTop.add(tag);
				produktTop.add(leer1);
				produktTop.add(leer2);
				produktTop.add(leer3);
				
				
				produktBottom.add(einkaufen);
				
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
				danke.setFont(danke1);
				tag.setFont(tag1);
				produktTop.setPreferredSize(new Dimension(10, 350));
				suchleer.setPreferredSize(new Dimension(200, 10));
				index.setPreferredSize(new Dimension(200, 10));
				mashtech.setPreferredSize(new Dimension(300, 80));
				einkaufen.setSize(250, 30);
				einkaufen.setLocation(70, 30);
			}


public static void main(String[] args) {
	View5 view5 = new View5();
}
}





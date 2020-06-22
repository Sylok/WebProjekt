package webshop;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class View4 extends JFrame implements ActionListener{
	
	private JFrame window;
	private JButton back, kaufen, aendern;
	private ArrayList waren;
	
	public View4(){
				// Frame
				 window = new JFrame("Warenkorb");
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
				produktBottom.setLayout(null);
				JPanel suche = new JPanel();
				suche.setLayout(new BorderLayout());
				JPanel index = new JPanel(new GridLayout(7, 1, 20, 5));
				JPanel suchleer = new JPanel();

				// Labels
				JLabel mashtech = new JLabel("Mashtech ");
				JLabel warenkorb = new JLabel("Ihr Warenkorb ");
				JLabel total = new JLabel("Total ");
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
				kaufen = new JButton("Produkte Kaufen");
				kaufen.addActionListener(this);
				aendern = new JButton("Zahlungsmethode Ändern");
				aendern.addActionListener(this);
				back = new JButton("<");
				back.addActionListener(this);
				
				// Array
				ArrayList<String> al=new ArrayList<String>();
				
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
				Font warenkorb1 = new Font("SansSerif", Font.BOLD, 30);
				Font total1 = new Font("SansSerif", Font.BOLD, 24);
				

				// JFrame add
				window.add(produkt, BorderLayout.CENTER);
				window.add(suche, BorderLayout.NORTH);
				window.add(index, BorderLayout.WEST);

				// JPanel add

				produkt.add(produktBottom, BorderLayout.CENTER);
				produkt.add(produktTop, BorderLayout.NORTH);
				
				produktTop.add(back);
				produktTop.add(warenkorb);
				produktTop.add(total);
				
				produktBottom.add(kaufen);
				produktBottom.add(aendern);
				
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
				warenkorb.setFont(warenkorb1);
				total.setFont(total1);
				produktTop.setPreferredSize(new Dimension(10, 350));
				suchleer.setPreferredSize(new Dimension(200, 10));
				index.setPreferredSize(new Dimension(200, 10));
				mashtech.setPreferredSize(new Dimension(300, 80));
				kaufen.setSize(250, 30);
				kaufen.setLocation(70, 30);
				aendern.setSize(250, 30);
				aendern.setLocation(350, 30);
				back.setSize(40, 40);
				back.setLocation(25, 25);
				warenkorb.setSize(400, 40);
				warenkorb.setLocation(75, 75);
			}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==this.back){
		View2 view2 = new View2();
		window.setVisible(false);
	}
	
	if(e.getSource()==this.kaufen){
		View5 view5 = new View5();
		window.setVisible(false);
	}
	
}
}



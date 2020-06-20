package webshop;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;

public class View2 {

	private Image image;
    private ImageObserver imageObserver;
	public View2() {
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
		produktTop.setLayout(new GridLayout(2, 4, 20, 5));
		JPanel produktBottom = new JPanel();
		produktBottom.setLayout(new GridLayout(2, 4, 20, 5));
		JPanel suche = new JPanel();
		suche.setLayout(new BorderLayout());
		JPanel index = new JPanel(new GridLayout(7, 1, 20, 5));
		JPanel suchleer = new JPanel();

		// Labels
		JLabel mashtech = new JLabel("Mashtech ");
		JLabel beliebt = new JLabel("Beliebt ");
		JLabel neuheiten = new JLabel("Neuheiten ");
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
		JButton produkt1 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\4201.jpg")*/);
		JButton produkt2 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\21661D2-250x250.png")*/);
		JButton produkt3 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\game-immortal-unchained.jpg")*/);
		JButton produkt4 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\GSPad-250x250.png")*/);
		JButton produkt5 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\intex-hamburger-island.jpg")*/);
		JButton produkt6 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\PS5_RENDER_GROUP_WITHNOTICE_01.jpg")*/);
		JButton produkt7 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\yu-gi-oh-destiny-board-traveler.jpg")*/);
		JButton produkt8 = new JButton(/*new ImageIcon("C:\\Users\\kaela\\Desktop\\Java Images\\figuren-paladone-game-p.jpg")*/);

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
		Font beliebt1 = new Font("SansSerif", Font.BOLD, 30);
		Font neuheiten1 = new Font("SansSerif", Font.BOLD, 30);


		// JFrame add
		window.add(produkt, BorderLayout.CENTER);
		window.add(suche, BorderLayout.NORTH);
		window.add(index, BorderLayout.WEST);

		// JPanel add
		produkt.add(produktTop, BorderLayout.NORTH);
		produkt.add(produktBottom, BorderLayout.CENTER);
		produktTop.add(beliebt);
		produktTop.add(leer1);
		produktTop.add(leer2);
		produktTop.add(leer3);
		produktTop.add(produkt1);
		produktTop.add(produkt2);
		produktTop.add(produkt3);
		produktTop.add(produkt4);
		produktBottom.add(neuheiten);
		produktBottom.add(leer4);
		produktBottom.add(leer5);
		produktBottom.add(leer6);
		produktBottom.add(produkt5);
		produktBottom.add(produkt6);
		produktBottom.add(produkt7);
		produktBottom.add(produkt8);

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
		beliebt.setFont(beliebt1);
		neuheiten.setFont(neuheiten1);
		produktTop.setPreferredSize(new Dimension(10, 300));
		suchleer.setPreferredSize(new Dimension(200, 10));
		index.setPreferredSize(new Dimension(200, 10));
		mashtech.setPreferredSize(new Dimension(300, 80));
		/* produkt1.setPadding(new Insets(50, 50, 50, 50));
		 produkt2.setMargin(new Insets(50, 50, 50, 50));
		 produkt3.setMargin(new Insets(50, 50, 50, 50));
		 produkt4.setMargin(new Insets(50, 50, 50, 50));
		 produkt5.setMargin(new Insets(50, 50, 50, 50));
		 produkt6.setMargin(new Insets(50, 50, 50, 50));
		 produkt7.setMargin(new Insets(50, 50, 50, 50));
		 produkt8.setMargin(new Insets(50, 50, 50, 50));*/
	}

	public static void main(String[] args) {
		View2 view2 = new View2();
	}
}

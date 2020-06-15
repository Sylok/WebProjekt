package webshop;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class View1 {
	public void buildGui()
	{
		JFrame window = new JFrame("View1");
				window.setSize(450,120);
		 		window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

			  	//Layout
			  	window.setLayout( new GridLayout(/*3*/ 0, 3, 6, 3) );

			  	//Labels
			  	JLabel userName = new JLabel("Benutzername: ");
			  	JLabel password = new JLabel("Passwort: ");
			  	JLabel leerzeile = new JLabel();
			  	JLabel leerzeile2 = new JLabel();

			  	//Textfields
			  	JTextField txtUserName = new JTextField();
			  	JPasswordField txtPassword = new JPasswordField();

			  	//Buttons
			  	JButton btnLogin = new JButton("Anmelden");
			  	JButton btnCancel = new JButton("Abbrechen");

			  	//Nachname:
			  	window.add(leerzeile);
			  	window.add(userName);
			  	window.add(txtUserName);
			  	window.add(password);
			  	window.add(txtPassword);
			  	window.add(leerzeile2);
			  	window.add(btnLogin);
			  	window.add(btnCancel);


		window.setVisible( true );
	}

	public static void main(String[] args)
	{
		new View1();
	}
}


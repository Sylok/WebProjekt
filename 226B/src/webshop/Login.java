package webshop;

import java.awt.GridLayout;

import javax.swing.*;

public class Login {
	public Login() {
		JFrame logon = new JFrame("View1");
		logon.setSize(450, 120);
		logon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		//Panel
		JPanel main = new JPanel();
		logon.add(main);
		
		// Layout
		logon.setLayout(new GridLayout(/* 3 */ 0, 1, 20, 5));
		main.setLayout(new GridLayout(/* 3 */ 0, 2, 20, 5));

		// Labels
		JLabel userName = new JLabel("Benutzername: ");
		JLabel password = new JLabel("Passwort: ");
		JLabel leerzeile = new JLabel();
		JLabel leerzeile2 = new JLabel();

		// Textfields
		JTextField txtUserName = new JTextField();
		JPasswordField txtPassword = new JPasswordField();

		// Buttons
		JButton btnLogin = new JButton("Anmelden");
		JButton btnCancel = new JButton("Abbrechen");

		// Nachname:
		main.add(userName);
		main.add(txtUserName);
		main.add(password);
		main.add(txtPassword);
		main.add(btnLogin);
		main.add(btnCancel);

		logon.setVisible(true);
	}

	public static void main(String[] args) {
		Login login = new Login();
	}

}

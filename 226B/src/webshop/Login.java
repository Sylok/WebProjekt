package webshop;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	private JFrame logon;
	private JTextField txtPassword, txtUserName;
	private JButton btnLogin, btnCancel;

	public Login() {
		logon = new JFrame("View1");
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

		// Panel
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
		txtUserName = new JTextField();
		txtPassword = new JPasswordField();

		// Buttons
		btnLogin = new JButton("Anmelden");
		btnLogin.addActionListener(this);
		btnCancel = new JButton("Abbrechen");

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

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.btnLogin && txtPassword.getText().equals("1234") && txtUserName.getText().equals("fred")) {
			View2 view2 = new View2();
			logon.setVisible(false);
		}

	}

}

package fontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;

public class ManagerLoginPage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JLabel Password;
	private JLabel username;
	private JTextField userText;
	private JPasswordField passwordField;
	private JLabel label;
	private JButton btnLogIn;
	private JLabel warningLbl;

	
	public ManagerLoginPage() {
		
		JDesktopPane desktopPaneMain = new JDesktopPane();
		desktopPaneMain.setBackground(new Color(224, 255, 255));
		getContentPane().add(desktopPaneMain, BorderLayout.CENTER);
		frame = new JFrame("Manager Login");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ManagerLoginPage.class.getResource("/icon/Headerlogo.jpg")));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 560, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ManagerLoginPage.class.getResource("/icon/manager.png")));
		lblNewLabel.setBounds(206, 11, 128, 148);
		contentPane.add(lblNewLabel);
		
		Password = new JLabel("Password");
		Password.setFont(new Font("Lato Black", Font.BOLD, 14));
		Password.setBounds(145, 262, 80, 14);
		contentPane.add(Password);
		
		username = new JLabel("Username");
		username.setFont(new Font("Lato Black", Font.BOLD, 14));
		username.setBounds(145, 225, 80, 14);
		contentPane.add(username);
		
		userText = new JTextField();
		userText.setFont(new Font("Lato Black", Font.BOLD, 12));
		userText.setBackground(new Color(224, 255, 255));
		userText.setBounds(235, 224, 159, 20);
		contentPane.add(userText);
		userText.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(224, 255, 255));
		passwordField.setBounds(235, 261, 159, 20);
		contentPane.add(passwordField);
		
		JLabel lblManagerLogin = new JLabel("Manager LogIn");
		lblManagerLogin.setForeground(new Color(255, 0, 0));
		lblManagerLogin.setFont(new Font("Arkhip", Font.BOLD, 20));
		lblManagerLogin.setBounds(190, 170, 176, 27);
		contentPane.add(lblManagerLogin);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerLoginPage.class.getResource("/icon/sBank-logo.png")));
		label.setBounds(10, -12, 243, 78);
		contentPane.add(label);
		
		btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = userText.getText();
				String password = passwordField.getText();
				if(username.equals("admin") && password.equals("admin")) {
					
					ManagerTab managerTab=new ManagerTab();
					managerTab.setVisible(true);
					//desktopPaneMain.add(managerTab);
				
					
				}
				else {
					warningLbl.getText();
					warningLbl.setText("Invalid Username/Password");
				}
				
			}
		});
		btnLogIn.setForeground(new Color(25, 25, 112));
		btnLogIn.setBackground(new Color(224, 255, 255));
		btnLogIn.setFont(new Font("Lato Black", Font.PLAIN, 15));
		btnLogIn.setBounds(235, 299, 89, 23);
		contentPane.add(btnLogIn);
		
		warningLbl = new JLabel("");
		warningLbl.setForeground(new Color(255, 0, 0));
		warningLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		warningLbl.setBounds(235, 279, 243, 20);
		contentPane.add(warningLbl);
		
		
		frame.setVisible(true);
		
	}
}

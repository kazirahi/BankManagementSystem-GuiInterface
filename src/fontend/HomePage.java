package fontend;

import java.awt.BorderLayout;
import backend.*;
import dao.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/icon/HeaderLogo.jpg")));
		setTitle("Aahan Bank Ltd. Developed by Rahi");
		setForeground(Color.CYAN);
		setBackground(new Color(255, 160, 122));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lato Black", Font.PLAIN, 24));
		lblNewLabel.setBounds(231, 11, 154, 81);
		contentPane.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Lato Black", Font.BOLD, 22));
		lblTo.setBounds(280, 67, 44, 50);
		contentPane.add(lblTo);
		
		JLabel lblDevelopedByRahi = new JLabel("Developed By Rahi");
		lblDevelopedByRahi.setBounds(231, 336, 110, 14);
		contentPane.add(lblDevelopedByRahi);
		
		JButton btnManagerLogin = new JButton("Manager Login");
		btnManagerLogin.setIcon(new ImageIcon(HomePage.class.getResource("/icon/managerbuttonlogo.png")));
		btnManagerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ManagerLoginPage();
				setVisible(false);
			}
		});
		btnManagerLogin.setForeground(Color.WHITE);
		btnManagerLogin.setBackground(Color.DARK_GRAY);
		btnManagerLogin.setFont(new Font("Lato Black", Font.PLAIN, 11));
		btnManagerLogin.setBounds(118, 181, 147, 33);
		contentPane.add(btnManagerLogin);
		
		JButton btnCustomerLogin = new JButton("Customer Login");
		btnCustomerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CustomerLoginPage();
				setVisible(false);
			}
		});
		btnCustomerLogin.setIcon(new ImageIcon(HomePage.class.getResource("/icon/customerbuttonicon.png")));
		btnCustomerLogin.setBackground(Color.DARK_GRAY);
		btnCustomerLogin.setForeground(Color.WHITE);
		btnCustomerLogin.setFont(new Font("Lato Black", Font.PLAIN, 11));
		btnCustomerLogin.setBounds(304, 181, 147, 33);
		contentPane.add(btnCustomerLogin);
		
		JButton btnCreateANew = new JButton("Create a New Account");
		btnCreateANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new NewAccount();
				setVisible(false);
			}
		});
		btnCreateANew.setIcon(new ImageIcon(HomePage.class.getResource("/icon/createacc.png")));
		btnCreateANew.setFont(new Font("Lato Black", Font.PLAIN, 11));
		btnCreateANew.setForeground(Color.WHITE);
		btnCreateANew.setBackground(Color.DARK_GRAY);
		btnCreateANew.setBounds(198, 230, 175, 33);
		contentPane.add(btnCreateANew);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(HomePage.class.getResource("/icon/Bank-logo.png")));
		label.setBounds(147, 92, 349, 56);
		contentPane.add(label);
	}
	
}

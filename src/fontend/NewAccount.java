package fontend;

import java.awt.BorderLayout;
import backend.*;
import dao.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewAccount extends JFrame { 

	
	private JPanel contentPane;
	private JTextField FirstNameField;
	private JTextField LastNameField;
	private JTextField EmailField;
	private JTextField ContractField;
	private JTextField AccField;
	private JLabel userlbl;
	private JLabel PassField;
	private JLabel warning;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount frame = new NewAccount();
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
	public NewAccount() {
		setTitle("Create Account");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewAccount.class.getResource("/icon/HeaderLogo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(NewAccount.class.getResource("/icon/sBank-logo.png")));
		label.setBounds(10, 11, 169, 49);
		contentPane.add(label);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setToolTipText("");
		lblFirstName.setFont(new Font("Lato Black", Font.BOLD, 14));
		lblFirstName.setBounds(88, 82, 91, 14);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Lato Black", Font.BOLD, 14));
		lblLastName.setBounds(88, 110, 91, 14);
		contentPane.add(lblLastName);

		JLabel lblEmailId = new JLabel("E-Mail ID:");
		lblEmailId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmailId.setFont(new Font("Lato Black", Font.BOLD, 14));
		lblEmailId.setBounds(88, 135, 91, 14);
		contentPane.add(lblEmailId);

		JLabel lblContractNo = new JLabel("Contract no.:");
		lblContractNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContractNo.setFont(new Font("Lato Black", Font.BOLD, 14));
		lblContractNo.setBounds(74, 160, 105, 14);
		contentPane.add(lblContractNo);

		JLabel lblAccountNo = new JLabel("Account No.:");
		lblAccountNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAccountNo.setFont(new Font("Lato Black", Font.BOLD, 14));
		lblAccountNo.setBounds(74, 185, 105, 14);
		contentPane.add(lblAccountNo);

		FirstNameField = new JTextField();
		FirstNameField.setFont(new Font("Lato Black", Font.BOLD, 14));
		FirstNameField.setBackground(new Color(224, 255, 255));
		FirstNameField.setBounds(202, 81, 248, 20);
		contentPane.add(FirstNameField);
		FirstNameField.setColumns(10);

		LastNameField = new JTextField();
		LastNameField.setBackground(new Color(224, 255, 255));
		LastNameField.setFont(new Font("Lato Black", Font.BOLD, 14));
		LastNameField.setBounds(202, 109, 248, 20);
		contentPane.add(LastNameField);
		LastNameField.setColumns(10);

		EmailField = new JTextField();
		EmailField.setFont(new Font("Lato Black", Font.BOLD, 14));
		EmailField.setColumns(10);
		EmailField.setBackground(new Color(224, 255, 255));
		EmailField.setBounds(202, 134, 248, 20);
		contentPane.add(EmailField);

		ContractField = new JTextField();
		ContractField.setFont(new Font("Lato Black", Font.BOLD, 14));
		ContractField.setColumns(10);
		ContractField.setBackground(new Color(224, 255, 255));
		ContractField.setBounds(202, 159, 248, 20);
		contentPane.add(ContractField);

		AccField = new JTextField();
		AccField.setFont(new Font("Lato Black", Font.BOLD, 14));
		AccField.setColumns(10);
		AccField.setBackground(new Color(224, 255, 255));
		AccField.setBounds(202, 184, 248, 20);
		contentPane.add(AccField);

		JButton btnNewButton = new JButton("Create an Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String firstname;
				Customer customer = new Customer();
				ProductDao productDao=new ProductDao();
				productDao.findAll();
				if (FirstNameField.getText().isEmpty()) {
					warning.getText();
					warning.setText("Firstname is empty");

				} else {
					FirstNameField.getText();
					
					

				}
				if (LastNameField.getText().isEmpty()) {
					warning.getText();
					warning.setText("Lastname is empty");

				} else {
					LastNameField.getText();
					

				}
				if (EmailField.getText().isEmpty()) {
					warning.getText();
					warning.setText("Email is empty");

				} else {
					EmailField.getText();
					

				}
				if (!ContractField.getText().matches("-?\\d+(\\.\\d+)?")) {
					warning.getText();
					warning.setText("Contract no is invalid");

				} else {
					ContractField.getText();
					

				}
				if (!AccField.getText().matches("-?\\d+(\\.\\d+)?")) {
					warning.getText();
					warning.setText("Account no is invalid");

				} else {
					AccField.getText();
					
					

				}
				
				if (!FirstNameField.getText().isEmpty() && !LastNameField.getText().isEmpty()
						&& !EmailField.getText().isEmpty() && !ContractField.getText().isEmpty()
						&& !AccField.getText().isEmpty()) {
					userlbl.getText();
					userlbl.setText("User Name: user");
					PassField.getText();
					PassField.setText("Password: user");
					warning.getText();
					warning.setText("Account Created Successfully!! PLease go to Customer login");

				}

			}
		});
		btnNewButton.setFont(new Font("Lato Black", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setBounds(169, 215, 307, 23);
		contentPane.add(btnNewButton);

		userlbl = new JLabel("");
		userlbl.setForeground(new Color(255, 0, 0));
		userlbl.setBackground(new Color(224, 255, 255));
		userlbl.setFont(new Font("Lato Black", Font.BOLD, 14));
		userlbl.setBounds(108, 263, 216, 20);
		contentPane.add(userlbl);

		PassField = new JLabel("");
		PassField.setForeground(Color.RED);
		PassField.setFont(new Font("Lato Black", Font.BOLD, 14));
		PassField.setBackground(new Color(224, 255, 255));
		PassField.setBounds(108, 294, 216, 20);
		contentPane.add(PassField);

		warning = new JLabel("");
		warning.setHorizontalAlignment(SwingConstants.CENTER);
		warning.setForeground(new Color(0, 0, 128));
		warning.setFont(new Font("Lato Black", Font.BOLD, 13));
		warning.setBackground(new Color(224, 255, 255));
		warning.setBounds(88, 325, 425, 20);
		contentPane.add(warning);

		JLabel lblCreateANew = new JLabel("Create a New Account");
		lblCreateANew.setForeground(new Color(0, 128, 128));
		lblCreateANew.setFont(new Font("Oswald Medium", Font.BOLD, 14));
		lblCreateANew.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateANew.setBounds(202, 44, 248, 26);
		contentPane.add(lblCreateANew);
		setVisible(true);
		
		
		
	}
}

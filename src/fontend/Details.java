package fontend;

import java.awt.BorderLayout;
import backend.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Details extends JFrame {

	private JPanel contentPane;
	private JTextField FirsttextField;
	private JTextField LastNametextField;
	private JTextField MailtextField;
	private JTextField ContracttextField;
	private JTextField AccounttextField;
	private JTextField BalancetextField;
	private JTextField DiposittextField;
	private JTextField withdrwltextField;

	/**
	 * Launch the application.
	 */
	
	public void Filldata(Customer customer) {
		FirsttextField.setText(customer.getFirstname());
		LastNametextField.setText(customer.getLastname());
		MailtextField.setText(customer.getEmail());
		ContracttextField.setText(customer.getContractno());
		AccounttextField.setText(customer.getAccno());
		
	}

	/**
	 * Create the frame.
	 */
	public Details() {
		setTitle("Customer Details");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Details.class.getResource("/icon/HeaderLogo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Details.class.getResource("/icon/sBank-logo.png")));
		lblNewLabel.setBounds(10, 11, 167, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblCustomerInformation = new JLabel("Customer Information");
		lblCustomerInformation.setForeground(new Color(0, 128, 128));
		lblCustomerInformation.setFont(new Font("Vibur", Font.BOLD, 20));
		lblCustomerInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerInformation.setBounds(93, 49, 225, 24);
		contentPane.add(lblCustomerInformation);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(25, 84, 86, 24);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblLastName.setBounds(25, 115, 86, 24);
		contentPane.add(lblLastName);
		
		JLabel lblMailId = new JLabel("Mail ID:");
		lblMailId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMailId.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblMailId.setBounds(25, 147, 86, 24);
		contentPane.add(lblMailId);
		
		JLabel lblContractNo = new JLabel("Account No.:");
		lblContractNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContractNo.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblContractNo.setBounds(10, 264, 101, 24);
		contentPane.add(lblContractNo);
		
		JLabel lblAccountInformation = new JLabel("Account Information:");
		lblAccountInformation.setForeground(new Color(0, 128, 0));
		lblAccountInformation.setFont(new Font("Lato Black", Font.BOLD, 18));
		lblAccountInformation.setBounds(10, 239, 388, 14);
		contentPane.add(lblAccountInformation);
		
		JLabel label = new JLabel("Contract No.:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Lato Black", Font.BOLD, 13));
		label.setBounds(10, 182, 101, 24);
		contentPane.add(label);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBalance.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblBalance.setBounds(10, 300, 101, 24);
		contentPane.add(lblBalance);
		
		JLabel lblDiposi = new JLabel("Diposit:");
		lblDiposi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiposi.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblDiposi.setBounds(10, 337, 101, 24);
		contentPane.add(lblDiposi);
		
		JLabel lblWithdrawl = new JLabel("Withdrawl:");
		lblWithdrawl.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWithdrawl.setFont(new Font("Lato Black", Font.BOLD, 13));
		lblWithdrawl.setBounds(10, 372, 101, 24);
		contentPane.add(lblWithdrawl);
		
		FirsttextField = new JTextField();
		FirsttextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		FirsttextField.setBackground(new Color(224, 255, 255));
		FirsttextField.setBounds(131, 87, 247, 20);
		contentPane.add(FirsttextField);
		FirsttextField.setColumns(10);
		
		LastNametextField = new JTextField();
		LastNametextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		LastNametextField.setColumns(10);
		LastNametextField.setBackground(new Color(224, 255, 255));
		LastNametextField.setBounds(131, 118, 247, 20);
		contentPane.add(LastNametextField);
		
		MailtextField = new JTextField();
		MailtextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		MailtextField.setColumns(10);
		MailtextField.setBackground(new Color(224, 255, 255));
		MailtextField.setBounds(131, 150, 247, 20);
		contentPane.add(MailtextField);
		
		ContracttextField = new JTextField();
		ContracttextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		ContracttextField.setColumns(10);
		ContracttextField.setBackground(new Color(224, 255, 255));
		ContracttextField.setBounds(131, 185, 247, 20);
		contentPane.add(ContracttextField);
		
		AccounttextField = new JTextField();
		AccounttextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		AccounttextField.setColumns(10);
		AccounttextField.setBackground(new Color(224, 255, 255));
		AccounttextField.setBounds(131, 267, 247, 20);
		contentPane.add(AccounttextField);
		
		BalancetextField = new JTextField();
		BalancetextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		BalancetextField.setColumns(10);
		BalancetextField.setBackground(new Color(224, 255, 255));
		BalancetextField.setBounds(131, 303, 158, 20);
		contentPane.add(BalancetextField);
		
		DiposittextField = new JTextField();
		DiposittextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		DiposittextField.setColumns(10);
		DiposittextField.setBackground(new Color(224, 255, 255));
		DiposittextField.setBounds(131, 340, 158, 20);
		contentPane.add(DiposittextField);
		
		withdrwltextField = new JTextField();
		withdrwltextField.setFont(new Font("Lato Black", Font.BOLD, 13));
		withdrwltextField.setColumns(10);
		withdrwltextField.setBackground(new Color(224, 255, 255));
		withdrwltextField.setBounds(131, 375, 158, 20);
		contentPane.add(withdrwltextField);
		
		JButton btnAddBalance = new JButton("Add Balance");
		btnAddBalance.setForeground(new Color(255, 255, 255));
		btnAddBalance.setBackground(new Color(0, 0, 0));
		btnAddBalance.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddBalance.setBounds(299, 302, 101, 22);
		contentPane.add(btnAddBalance);
		//setVisible(true);
	}
}

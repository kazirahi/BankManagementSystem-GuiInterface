package fontend;

import java.awt.BorderLayout;
import backend.*;
import dao.*;
import fontend.Details;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagerTab extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tableCustomer;
	
	

	/**
	 * Create the frame.
	 */
	private void FillData() {
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("FirstName");
		defaultTableModel.addColumn("LastName");
		defaultTableModel.addColumn("Email");
		defaultTableModel.addColumn("PhoneNo");
		defaultTableModel.addColumn("AccNo");
		ProductDao productDao = new ProductDao();
		for (Customer customer : productDao.findAll()) {
			defaultTableModel.addRow(new Object[] { customer.getFirstname(), customer.getLastname(),
					customer.getEmail(), customer.getContractno(), customer.getAccno() });
		}
		tableCustomer.setModel(defaultTableModel);
	}

	public ManagerTab() {
		setTitle("Manager Tab");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ManagerTab.class.getResource("/icon/HeaderLogo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerTab.class.getResource("/icon/sBank-logo.png")));
		label.setBounds(10, 11, 168, 45);
		contentPane.add(label);

		JLabel lblWelcomeMrManager = new JLabel("Welcome MR. Manager");
		lblWelcomeMrManager.setFont(new Font("Lato Black", Font.BOLD, 12));
		lblWelcomeMrManager.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcomeMrManager.setBounds(625, 11, 149, 14);
		contentPane.add(lblWelcomeMrManager);

		JButton btnAddAccount = new JButton("Add Account");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new NewAccount();

			}
		});
		btnAddAccount.setForeground(new Color(255, 255, 255));
		btnAddAccount.setFont(new Font("Lato Black", Font.BOLD, 10));
		btnAddAccount.setBackground(new Color(0, 0, 0));
		btnAddAccount.setBounds(20, 67, 117, 23);
		contentPane.add(btnAddAccount);

		JButton btnRemove = new JButton("Remove Account");
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setFont(new Font("Lato Black", Font.BOLD, 8));
		btnRemove.setBackground(Color.BLACK);
		btnRemove.setBounds(163, 67, 117, 23);
		contentPane.add(btnRemove);

		JButton btnDipposit = new JButton("Dipposit");
		btnDipposit.setForeground(Color.WHITE);
		btnDipposit.setFont(new Font("Lato Black", Font.BOLD, 10));
		btnDipposit.setBackground(Color.BLACK);
		btnDipposit.setBounds(303, 67, 117, 23);
		contentPane.add(btnDipposit);

		JButton btnWithdrawl = new JButton("Withdrawl");
		btnWithdrawl.setForeground(Color.WHITE);
		btnWithdrawl.setFont(new Font("Lato Black", Font.BOLD, 10));
		btnWithdrawl.setBackground(Color.BLACK);
		btnWithdrawl.setBounds(443, 68, 117, 23);
		contentPane.add(btnWithdrawl);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 101, 764, 232);
		contentPane.add(scrollPane);

		tableCustomer = new JTable();
		tableCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Details details=new Details();
				details.setVisible(true);
				Customer customer=new Customer();
					ProductDao productDao = new ProductDao();
					int currentRow = tableCustomer.getSelectedRow();
					details.Filldata(productDao.search(tableCustomer.getValueAt(currentRow, 0).toString()));
		
			}
		});
		scrollPane.setViewportView(tableCustomer);
		FillData();

		setVisible(true);
	}
}

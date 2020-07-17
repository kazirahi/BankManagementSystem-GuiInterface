package fontend;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame {
	
	public Table(){
		Object [][] data= {};
		String [] columnHeader= {"First Name", "Email", "Balance", "Deposite", "Withdrawl"};
		JTable table =  new JTable(data,columnHeader);
		table.setPreferredScrollableViewportSize(new Dimension(600,80));
		JScrollPane pane=new JScrollPane(table);
		getContentPane().add(pane,BorderLayout.CENTER);
		setVisible(true);
	}
	

}

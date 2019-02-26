import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccount extends JFrame
{
	ArrayList<BankAccount> accounts = new ArrayList();
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount()
	{
		setTitle("Bank Account");
		setBounds(100, 100, 800, 600);
		setLayout(null);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setBounds(20, 20, 50, 50);
		add(nameLabel);
		
		JLabel accType = new JLabel("Account Type:");
		accType.setBounds(20, 50, 100, 50);
		add(accType);
		
		JLabel initial = new JLabel("Initial Balance:");
		initial.setBounds(20, 80, 100, 50);
		add(initial);
		
		JTextField nameInput = new JTextField();
		nameInput.setBounds(65, 30, 150, 25);
		add(nameInput);
		
		JButton accCreate = new JButton("Create Account");
		accCreate.setBounds(20, 130, 130, 25);
		add(accCreate);
		accCreate.addActionListener(new ActionListener() { 
			public void actionPerformed (ActionEvent e)
				{
					name = nameInput.getText();
				}
			});
		
		JButton displayAcc = new JButton("Display All Accounts");
		displayAcc.setBounds(160, 130, 160, 25);
		add(displayAcc);
		
		JTextField balanceInput = new JTextField();
		balanceInput.setBounds(110, 90, 150, 25);
		add(balanceInput);
		
		JComboBox<String> box =  new JComboBox<String>();
		box.addItem("Please Select");
		box.addItem("Checking Account");
		box.addItem("Savings Account");
		box.setBounds(110, 65, 130, 20);
		add(box);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main (String []args)
	{
		new BankAccount();
	}

}

package com.testswing;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Mainframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txturl;
	private JTextField txtgroupid;
	private JTextField txtpath;
	private JTextField textField;


	public static void main(String[] args) throws Exception {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe frame = new Mainframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Mainframe() {
		try {
			UIManager.setLookAndFeel(new MetalLookAndFeel()); 
    } 
    catch (Exception e) {
       e.printStackTrace();
    }
		setTitle("Mainframe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 857, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		//lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(26, 150, 97, 36);
		contentPane.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(49, 198, 232, 36);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
//		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(378, 150, 128, 36);
		contentPane.add(lblNewLabel_2);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(378, 195, 232, 36);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Git URL");
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(26, 26, 170, 36);
		contentPane.add(lblNewLabel_3);
		
		txturl = new JTextField();
		txturl.setBounds(49, 88, 585, 36);
		contentPane.add(txturl);
		txturl.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Group ID");
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(26, 275, 106, 28);
		contentPane.add(lblNewLabel_4);
		
		txtgroupid = new JTextField();
		txtgroupid.setBounds(49, 328, 148, 36);
		contentPane.add(txtgroupid);
		txtgroupid.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
//				System.out.println("Hi");
				String uname = txtUsername.getText();
				System.out.println(uname);
			}
		});
		btnNewButton.setBounds(344, 541, 148, 36);
		contentPane.add(btnNewButton);
		
		txtpath = new JTextField();
		txtpath.setBounds(49, 444, 314, 36);
		contentPane.add(txtpath);
		txtpath.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Local Path");
//		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(26, 390, 128, 28);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Browse");
		btnNewButton_1.setBounds(404, 449, 101, 26);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Branch Name");
		lblNewLabel_1.setBounds(378, 275, 106, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(378, 328, 148, 36);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

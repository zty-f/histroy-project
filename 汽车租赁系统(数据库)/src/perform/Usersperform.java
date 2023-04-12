package perform;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import data.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
/*�̳У��ӿڵ��������*/
public class Usersperform  extends JFrame implements ActionListener {

	private static JFrame frame;
	private JTextField textField;
	private static Connection con = Database.getCon();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	/**
	 * Launch the application.
	 */
	public static void qidong() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usersperform window = new Usersperform();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Usersperform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/* �ӿڣ��̳У���̬��ʵ�� */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u7528\u6237\u6CE8\u518C(\u5F20\u5929\u6CF3201931104202)");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("��Բ", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 34, 72, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u521B\u5EFA\u5BC6\u7801");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("��Բ", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(58, 88, 72, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.setFont(new Font("΢���ź�", Font.BOLD, 19));
		btnNewButton.setBounds(79, 200, 113, 27);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		textField = new JTextField();
		textField.setBounds(157, 31, 142, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("��Բ", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(58, 133, 72, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 85, 142, 27);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(157, 131, 142, 27);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton_1 = new JButton("\u6CE8\u9500");
		
		btnNewButton_1.setFont(new Font("΢���ź�", Font.BOLD, 19));
		btnNewButton_1.setBounds(229, 200, 113, 27);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\u=162813760,2205576973&fm=26&gp=0.jpg"));
		lblNewLabel_3.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(lblNewLabel_3);
	}
	@Override /* ע������ */
	/* ��д����ķ��� *//* ����ʵ�� *//* ��̬������� *//* �ӿ����� */
public void actionPerformed(ActionEvent e) {

	switch (e.getActionCommand()) {
	case "ע��":{
	if (textField.getText().isEmpty() && passwordField.getText().isEmpty() && passwordField_1.getText().isEmpty()) {
		JOptionPane.showMessageDialog(null, "�뽫��Ϣ�������", "��ʾ", JOptionPane.ERROR_MESSAGE);
	}
	else if(passwordField_1.getText().equals(passwordField.getText()))
	{
		try {
			PreparedStatement ps = con.prepareStatement("insert into  user_  values(?,?,?,?,?)");
			ps.setString(1, textField.getText());
			ps.setString(2, passwordField.getText());
			ps.setString(3,"28");
			ps.setString(4,"ѧ��");
			ps.setString(5, "��");
			ps.executeUpdate();
			
		} catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(null, "�û�ע��ʧ�ܣ��������������Ƿ���ȷ��", "��ʾ", JOptionPane.ERROR_MESSAGE);
			sqlException.printStackTrace();
			break;
		}
	JOptionPane.showMessageDialog(null, "�û�ע��ɹ���", "��ʾ", JOptionPane.WARNING_MESSAGE);
		break;

	}
	}
	case "ע��":{
		  
		try {
			PreparedStatement ps = con.prepareStatement("delete from user_ where uname=?");
			ps.setString(1, textField.getText());
			ps.executeUpdate();
			
		} catch (SQLException throwers) {
			throwers.printStackTrace();
			JOptionPane.showMessageDialog(null, "�û�ע��ʧ�ܣ�������Ϣ��ʽ�Ƿ���ȷ��", "��ʾ", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		JOptionPane.showMessageDialog(null, "�û�ע���ɹ���", "��ʾ", JOptionPane.WARNING_MESSAGE);
		break; 
		
	}}
}
}
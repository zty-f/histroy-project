package perform;


import data.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.ImageIcon;

public class LoginPerform {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		new Database();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPerform window = new LoginPerform();
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

	public LoginPerform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.GUIÉè¼Æ
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(192, 192, 192));
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		frame.setForeground(Color.BLACK);
		frame.setTitle("\u8F66\u8F86\u79DF\u8D41\u7CFB\u7EDF(\u5F20\u5929\u6CF3201931104202)");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\u767B\u5F55\u540D\uFF1A");
		lblNewLabel.setFont(new Font("ËÎÌå", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(63, 82, 72, 18);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("ËÎÌå", Font.BOLD, 15));
		lblNewLabel_1.setBounds(73, 132, 72, 18);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(125, 79, 158, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(125, 132, 158, 24);
		frame.getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 14));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				@SuppressWarnings("deprecation")
				boolean result = Database.adminLogin(textField.getText().trim(), passwordField.getText().trim());
				if (result) {

					// µÇÂ¼³É¹¦
					// newMainView().setVisible(true);
					// this.setVisible(false);

					Mainperform_.qidong();
					System.out.println("µÇÂ¼³É¹¦£¡");
					frame.dispose();

				} else { // µÇÂ½Ê§°Ü
					JOptionPane.showMessageDialog(null, "µÇÂ¼Ãû»òÃÜÂë´íÎó£¬ÇëÖØÊÔ£¡", "ÌáÊ¾", JOptionPane.ERROR_MESSAGE);
				}
			}

		});

		btnNewButton.setBounds(163, 181, 79, 27);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\1111.png"));
		lblNewLabel_2.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(lblNewLabel_2);
	}

}

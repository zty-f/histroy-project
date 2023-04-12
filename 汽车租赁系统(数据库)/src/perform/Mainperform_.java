package perform;
import data.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Mainperform_ {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	
	public static void qidong() {
		
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainperform_ window = new Mainperform_();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}

	/**
	 * Create the application.
	 */
	public Mainperform_() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBackground(Color.WHITE);
		frame.setForeground(SystemColor.desktop);
		frame.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 14));
		frame.setTitle("\u529F\u80FD\u9009\u62E9(\u5F20\u5929\u6CF3201931104202)");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setBounds(100, 100, 501, 370);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6C7D   \u8F66   \u79DF   \u8D41   \u7CFB   \u7EDF");
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setIcon(null);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(61, 0, 364, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u8F66\u8F86\u4FE1\u606F\u7BA1\u7406");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarInfoperform.qidong();
			}
		});
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(74, 145, 136, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u79DF\u8F66\u4FE1\u606F\u7BA1\u7406");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RentCarperform.qidong();
			}
		});
		btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 17));
		btnNewButton_1.setSelectedIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\5b2899d28e0a7.jpg"));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setBounds(261, 145, 136, 65);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("\u6CE8\u518C\u7528\u6237");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Usersperform.qidong();
			}
		});
		btnNewButton_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setBounds(181, 72, 113, 48);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("\u7EFC\u5408\u4FE1\u606F\u7BA1\u7406");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				findtypeperform.qidong();
			}
		});
		btnNewButton_5_1.setForeground(Color.RED);
		btnNewButton_5_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_5_1.setBackground(Color.ORANGE);
		btnNewButton_5_1.setBounds(171, 243, 147, 48);
		frame.getContentPane().add(btnNewButton_5_1);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\\u4E0B\u8F7D.jpg"));
		lblNewLabel_1.setBounds(0, 0, 483, 323);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

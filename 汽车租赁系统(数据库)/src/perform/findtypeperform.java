package perform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class findtypeperform {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void qidong() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findtypeperform window = new findtypeperform();
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
	public findtypeperform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u67E5\u8BE2\u529F\u80FD(\u5F20\u5929\u6CF3201931104202)");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u8F66\u8F86\u4FE1\u606F\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findcarperform.qidong();
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("华文行楷", Font.BOLD, 18));
		btnNewButton.setBounds(115, 59, 183, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u79DF\u8F66\u4FE1\u606F\u67E5\u8BE2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findrentperform.qidong();
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("华文行楷", Font.BOLD, 17));
		btnNewButton_1.setBounds(115, 154, 183, 64);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\untitled.png"));
		lblNewLabel.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(lblNewLabel);
	}

}

package perform;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTable;

import data.Database;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;

public class findcarperform {

	private JFrame frame;
	private static Connection con = Database.getCon();
	private JTextField textField;
    private int flag=3;
    private JTable table;
    
	/**
	 * Launch the application.
	 */
	public static void qidong () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findcarperform window = new findcarperform();
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
	public findcarperform(){
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setTitle("\u8F66\u8F86\u67E5\u8BE2(\u5F20\u5929\u6CF3201931104202)");
		frame.setBounds(100, 100, 598, 762);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(307, 115, 113, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u5F00\u59CB\u67E5\u8BE2");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(434, 114, 113, 27);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==2)
				{
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
							},
							new String[] {
								"\u8F66\u8F86\u7F16\u53F7", "\u8F66\u8F86\u540D\u79F0", "\u8F66\u8F86\u989C\u8272", "\u8F66\u8F86\u7C7B\u578B", "\u8F66\u8F86\u8BA1\u4EF7", "\u8F66\u8F86\u72B6\u6001"
							}
						) );
					int j = 0;
					PreparedStatement s;
					try {
						s = con.prepareStatement("execute selectcar1 @color=?");
						s.setString(1, textField.getText());
						ResultSet r = s.executeQuery();
						while (r.next()) {
						String number = r.getString(1);
						String brand = r.getString(2);
						String date = r.getString(3);
						String state = r.getString(4);
						String username = r.getString(5);
						String carstatus = r.getString(6);
						table.setValueAt(number, j, 0);
						table.setValueAt(brand, j, 1);
						table.setValueAt(date, j, 2);
						table.setValueAt(state, j, 3);
						table.setValueAt(username, j, 4);
						table.setValueAt(carstatus, j, 5);
						j++;
					}		
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					
					
				}
				else if(flag==1)
				{
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
							},
							new String[] {
								"\u8F66\u8F86\u7F16\u53F7", "\u8F66\u8F86\u540D\u79F0", "\u8F66\u8F86\u989C\u8272", "\u8F66\u8F86\u7C7B\u578B", "\u8F66\u8F86\u8BA1\u4EF7", "\u8F66\u8F86\u72B6\u6001"
							}
						) );
					int j = 0;
					PreparedStatement s;
					try {
						s = con.prepareStatement("execute selectcar2 @type=?");
						s.setString(1, textField.getText());
						ResultSet r = s.executeQuery();
						while (r.next()) {
						String number = r.getString(1);
						String brand = r.getString(2);
						String date = r.getString(3);
						String state = r.getString(4);
						String username = r.getString(5);
						String carstatus = r.getString(6);
						table.setValueAt(number, j, 0);
						table.setValueAt(brand, j, 1);
						table.setValueAt(date, j, 2);
						table.setValueAt(state, j, 3);
						table.setValueAt(username, j, 4);
						table.setValueAt(carstatus, j, 5);
						j++;
					}		
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
				else if(flag==3)
				{
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
							},
							new String[] {
								"\u8F66\u8F86\u7F16\u53F7", "\u8F66\u8F86\u540D\u79F0", "\u8F66\u8F86\u989C\u8272", "\u8F66\u8F86\u7C7B\u578B", "\u8F66\u8F86\u8BA1\u4EF7", "\u8F66\u8F86\u72B6\u6001"
							}
						) );
					int j = 0;
					PreparedStatement s;
					try {
						s = con.prepareStatement("select * from car_  where cstatus=? ");
						s.setString(1, textField.getText());
						ResultSet r = s.executeQuery();
						while (r.next()) {
						String number = r.getString(1);
						String brand = r.getString(2);
						String date = r.getString(3);
						String state = r.getString(4);
						String username = r.getString(5);
						String carstatus = r.getString(6);
						table.setValueAt(number, j, 0);
						table.setValueAt(brand, j, 1);
						table.setValueAt(date, j, 2);
						table.setValueAt(state, j, 3);
						table.setValueAt(username, j, 4);
						table.setValueAt(carstatus, j, 5);
						j++;
					}		
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u5173\u952E\u5B57\uFF08\u652F\u6301\u6A21\u7CCA\u67E5\u8BE2\uFF09");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 17));
		lblNewLabel.setBounds(25, 109, 278, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBackground(Color.CYAN);
		comboBox.setBounds(82, 48, 147, 24);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent x) {
				String q=comboBox.getSelectedItem().toString();
				switch(q) {
				case "按照车辆类型查询":flag=1;break;
				case "按照车辆颜色查询":flag=2;break;
				case "按照车辆状态查询":flag=3;break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u6309\u7167\u8F66\u8F86\u7C7B\u578B\u67E5\u8BE2", "\u6309\u7167\u8F66\u8F86\u989C\u8272\u67E5\u8BE2", "\u6309\u7167\u8F66\u8F86\u72B6\u6001\u67E5\u8BE2"}));
		comboBox.setSelectedIndex(2);
		frame.getContentPane().add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(130, 135, 144)), "\u67E5\u8BE2\u4FE1\u606F", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 152, 580, 564);
		frame.getContentPane().add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(14, 24, 528, 540);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u8F66\u8F86\u7F16\u53F7", "\u8F66\u8F86\u540D\u79F0", "\u8F66\u8F86\u989C\u8272", "\u8F66\u8F86\u7C7B\u578B", "\u8F66\u8F86\u8BA1\u4EF7", "\u8F66\u8F86\u72B6\u6001"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setMinWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(84);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setMinWidth(30);
		table.getColumnModel().getColumn(4).setPreferredWidth(84);
		table.getColumnModel().getColumn(4).setMinWidth(30);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\793b89d423aafe95cbc857ed702c17330d5e195c.jpg"));
		lblNewLabel_1.setBounds(0, 0, 580, 715);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
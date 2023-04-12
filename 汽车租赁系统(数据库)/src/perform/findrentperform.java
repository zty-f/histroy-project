package perform;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import data.Database;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class findrentperform {

	private JFrame frame;
    private int flag=3;
    private JTextField textField;
    private static Connection con = Database.getCon();
    private JPanel panel;
    private JScrollPane scrollPane;
    private JTable table;
    private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void qidong() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findrentperform window = new findrentperform();
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
	public findrentperform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setTitle("\u79DF\u8F66\u4FE1\u606F\u67E5\u8BE2(\u5F20\u5929\u6CF3201931104202)");
		frame.setBounds(100, 100, 706, 644);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.CYAN);
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u67E5\u8BE2\u6240\u6709\u79DF\u8F66\u4FE1\u606F", "\u67E5\u8BE2\u8BA2\u5355\u4EE5\u53CA\u5BF9\u5E94\u7528\u6237", "\u67E5\u8BE2\u8BA2\u5355\u4EE5\u53CA\u5BF9\u5E94\u8F66\u8F86\u4FE1\u606F"}));
		comboBox.setSelectedIndex(2);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent x) {
				String q=comboBox.getSelectedItem().toString();
				switch(q) {
				case "查询所有租车信息":flag=1;break;
				case "查询订单以及对应用户":flag=2;break;
				case "查询订单以及对应车辆信息":flag=3;break;
				}
			}
		});
		comboBox.setBounds(14, 25, 232, 29);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u5173\u952E\u5B57\uFF08\u652F\u6301\u6A21\u7CCA\u67E5\u8BE2\uFF09");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(14, 66, 245, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==1)
				{
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
							},
							new String[] {
								"租车编号", "租车时间", "租车用户", "车辆编号", "租车费用", "*", "*", "*"
							}
						));
					int j = 0;
					PreparedStatement s;
					try {
						s = con.prepareStatement("select * from rentcar_");
						ResultSet r = s.executeQuery();
						while (r.next()) {
							String number = r.getString(1);
							String brand = r.getString(2);
							String date = r.getString(3);
							String state = r.getString(4);
							String username = r.getString(5);		
							table.setValueAt(number, j, 0);
							table.setValueAt(brand, j, 1);
							table.setValueAt(date, j, 2);
							table.setValueAt(state, j, 3);
							table.setValueAt(username, j, 4);
						j++;
					}		
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					
					
				}
				else if(flag==2)
				{
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
							},
							new String[] {
								"租车编号", "租车时间", "租车用户", "车辆编号", "租车费用", "用户年龄", "用户职业", "用户性别"
							}
						));
					int j = 0;
					PreparedStatement s;
					try {
						s = con.prepareStatement("select rid,rtime,fkuname,fkcid,rprice,uage,udept,usex from rentcar_,user_  where fkuname=uname and rid=? ");
						s.setString(1, textField.getText());
						ResultSet r = s.executeQuery();
						while (r.next()) {
							String number = r.getString(1);
							String brand = r.getString(2);
							String date = r.getString(3);
							String state = r.getString(4);
							String username = r.getString(5);
							String uage = r.getString(6);
							String udept = r.getString(7);
							String usex = r.getString(8);
							table.setValueAt(number, j, 0);
							table.setValueAt(brand, j, 1);
							table.setValueAt(date, j, 2);
							table.setValueAt(state, j, 3);
							table.setValueAt(username, j, 4);
							table.setValueAt(uage, j, 5);
							table.setValueAt(udept, j, 6);
							table.setValueAt(usex, j, 7);
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
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
							},
							new String[] {
								"租车编号", "租车时间", "租车用户", "车辆编号", "租车费用", "车辆名字", "车辆颜色", "车辆类型"
							}
						));
					int j = 0;
					PreparedStatement s;
					try {
						s = con.prepareStatement("select rid,rtime,fkuname,fkcid,rprice,cname,ccolor,ctype from rentcar_,car_  where fkcid=cid and rid=? ");
						s.setString(1, textField.getText());
						ResultSet r = s.executeQuery();
						while (r.next()) {
							String number = r.getString(1);
							String brand = r.getString(2);
							String date = r.getString(3);
							String state = r.getString(4);
							String username = r.getString(5);
							String cname = r.getString(6);
							String ccolor = r.getString(7);
							String ctype = r.getString(8);
							table.setValueAt(number, j, 0);
							table.setValueAt(brand, j, 1);
							table.setValueAt(date, j, 2);
							table.setValueAt(state, j, 3);
							table.setValueAt(username, j, 4);
							table.setValueAt(cname, j, 5);
							table.setValueAt(ccolor, j, 6);
							table.setValueAt(ctype, j, 7);
						j++;
					}		
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
			}
			
		});
		btnNewButton.setBounds(511, 68, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(265, 67, 221, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(130, 135, 144)), "\u67E5\u8BE2\u4FE1\u606F", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 124, 687, 473);
		frame.getContentPane().add(panel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 24, 659, 420);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"*", "*", "*", "*", "*", "*", "*"
			}
		));
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\793b89d423aafe95cbc857ed702c17330d5e195c.jpg"));
		lblNewLabel_1.setBounds(1, 0, 686, 597);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

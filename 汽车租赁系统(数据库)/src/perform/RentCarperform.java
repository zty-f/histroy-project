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
import java.awt.Toolkit;
/*�̳У��ӿڵ��������*/
public class RentCarperform extends JFrame implements ActionListener{

	private static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private static Connection con = Database.getCon();
	/**
	 * Launch the application.
	 */
	public static void qidong() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentCarperform window = new RentCarperform();
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
	public RentCarperform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/* �ӿڣ��̳У���̬��ʵ�� */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u79DF\u8F66\u4FE1\u606F\u7BA1\u7406(\u5F20\u5929\u6CF3201931104202)");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\86134\\Pictures\\Camera Roll\\u=2402326316,3875421722&fm=26&gp=0.jpg"));
		frame.setBounds(100, 100, 672, 709);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(130, 135, 144)), "\u79DF\u8F66\u4FE1\u606F", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(14, 13, 475, 593);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 24, 447, 556);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		Refresh();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "\u4FE1\u606F\u64CD\u4F5C", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(503, 13, 137, 593);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u79DF\u8F66\u7F16\u53F7");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 17));
		lblNewLabel.setBounds(31, 47, 72, 18);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u79DF\u8F66\u65F6\u95F4");
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(31, 109, 72, 18);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u79DF\u8F66\u7528\u6237");
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(31, 174, 72, 18);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u8F66\u8F86ID");
		lblNewLabel_3.setFont(new Font("΢���ź�", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(31, 243, 72, 18);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u79DF\u8F66\u8D39\u7528");
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(31, 311, 72, 18);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(17, 78, 93, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(17, 140, 93, 24);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(17, 205, 93, 24);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(17, 274, 93, 24);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(17, 344, 93, 24);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setFont(new Font("΢���ź�", Font.PLAIN, 19));
		btnNewButton_1.setBounds(17, 441, 106, 27);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		JButton btnNewButton_2 = new JButton("\u5220\u9664");
		btnNewButton_2.setFont(new Font("΢���ź�", Font.PLAIN, 19));
		btnNewButton_2.setBounds(17, 492, 106, 27);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		JButton btnNewButton_3 = new JButton("\u5237\u65B0");
		btnNewButton_3.setFont(new Font("΢���ź�", Font.PLAIN, 19));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(17, 541, 106, 27);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		JButton btnNewButton_1_1 = new JButton("\u6DFB\u52A0");
		btnNewButton_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 19));
		btnNewButton_1_1.setBounds(17, 394, 106, 27);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\86134\\Pictures\\Camera Roll\\793b89d423aafe95cbc857ed702c17330d5e195c.jpg"));
		lblNewLabel_5.setBounds(0, 0, 654, 662);
		frame.getContentPane().add(lblNewLabel_5);
		btnNewButton_1_1.addActionListener(this);
	}
	@Override /* ע������ */
	/* ��д����ķ��� *//* ����ʵ�� *//* ��̬������� *//* �ӿ����� */
	public void actionPerformed(ActionEvent e) {

		if (textField.getText().isEmpty() && textField_1.getText().isEmpty() && textField_2.getText().isEmpty()
				&& textField_3.getText().isEmpty() && textField_4.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "�뽫��Ϣ�������", "��ʾ", JOptionPane.ERROR_MESSAGE);
		}
		switch (e.getActionCommand()) {
		case "���":{
			try {
				PreparedStatement ps = con.prepareStatement("insert into  rentcar_  values(?,?,?,?,?)");
				ps.setString(1, textField.getText());
				ps.setString(2, textField_1.getText());
				ps.setString(3, textField_2.getText());
				ps.setString(4, textField_3.getText());
				ps.setString(5, textField_4.getText());
				ps.executeUpdate();
				// this.refresh();

			} catch (SQLException sqlException) {
				
				if(sqlException.getErrorCode()==3609)
					JOptionPane.showMessageDialog(null, "����,���������⳵��", "��ʾ", JOptionPane.ERROR_MESSAGE);
				else
				JOptionPane.showMessageDialog(null, "��Ϣ���ʧ�ܣ�������Ϣ��ʽ�Ƿ���ȷ��", "��ʾ", JOptionPane.ERROR_MESSAGE);
				sqlException.printStackTrace();
				break;
			}
			JOptionPane.showMessageDialog(null, "��Ϣ��ӳɹ���", "��ʾ", JOptionPane.WARNING_MESSAGE);
			break;}

		case "�޸�": {
			int a=0;
			try {
				PreparedStatement p = con.prepareStatement("select * from rentcar_");
				ResultSet r = p.executeQuery();
				while(r.next())
					a++;
			} catch (SQLException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			try {

				PreparedStatement ps = con
						.prepareStatement("update rentcar_ set rtime=?, fkuname=?, fkcid=?, rprice=? where rid=?");
				ps.setString(5, textField.getText());
				ps.setString(1, textField_1.getText());
				ps.setString(2, textField_2.getText());
				ps.setString(3, textField_3.getText());
				ps.setString(4, textField_4.getText());
				ps.executeUpdate();

			} catch (SQLException throwers) {
				throwers.printStackTrace();
				JOptionPane.showMessageDialog(null, "��Ϣ�޸�ʧ�ܣ�������Ϣ��ʽ�Ƿ���ȷ��", "��ʾ", JOptionPane.ERROR_MESSAGE);
				break;
			}
			JOptionPane.showMessageDialog(null, "��Ϣ�޸ĳɹ���", "��ʾ", JOptionPane.WARNING_MESSAGE);
			break;
		}
		case "ɾ��": {
			int a=0;
			try {
				PreparedStatement p = con.prepareStatement("select * from rentcar_");
				ResultSet r = p.executeQuery();
				while(r.next())
					a++;
			} catch (SQLException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			try {
				PreparedStatement ps = con.prepareStatement("delete from rentcar_ where rid=?");
				ps.setString(1, textField.getText());
				ps.executeUpdate();

			} catch (SQLException throwers) {
				throwers.printStackTrace();
				JOptionPane.showMessageDialog(null, "��Ϣɾ��ʧ�ܣ�������Ϣ��ʽ�Ƿ���ȷ��", "��ʾ", JOptionPane.ERROR_MESSAGE);
				break;
			}
			JOptionPane.showMessageDialog(null, "��Ϣɾ���ɹ���", "��ʾ", JOptionPane.WARNING_MESSAGE);
			break;
		}
		case "ˢ��":{

			this.Refresh();

			JOptionPane.showMessageDialog(null, "ˢ�³ɹ���", "��ʾ", JOptionPane.WARNING_MESSAGE);
			break;}
		}
	}

	public void Refresh() {
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u79DF\u8F66\u7F16\u53F7", "\u79DF\u8F66\u65F6\u95F4", "\u79DF\u8F66\u7528\u6237", "\u8F66\u8F86ID", "\u79DF\u8F66\u8D39\u7528"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setMinWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(105);
		table.getColumnModel().getColumn(3).setMinWidth(30);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setMinWidth(30);
		try {
			int j = 0;
			PreparedStatement s = con.prepareStatement("select * from rentcar_");
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

		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ˢ��ʧ�ܣ�", "��ʾ", JOptionPane.ERROR_MESSAGE);
		}

	}
	
}



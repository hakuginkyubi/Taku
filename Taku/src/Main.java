

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField b;
	private JTextField c;
	private DefaultTableModel tm;
	private JTable table_1;
	private JButton a;

	public Main(){
		//ボタンで閉じる
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		this.setSize(new Dimension(480, 500));
		getContentPane().setLayout(null);
		//パネルを作る
		JPanel panel = new JPanel();
		panel.setBounds(126, 6, 39, 26);
		getContentPane().add(panel);
		//ラベルで名前を作る
		JLabel label = new JLabel("名前");
		panel.add(label);
		//テキストフィールドを作る
		c = new JTextField();
		c.setColumns(10);
		c.setBounds(170, 33, 304, 26);
		getContentPane().add(c);
		//パネルを作る
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(84, 33, 81, 26);
		getContentPane().add(panel_1);
		//ラベルでメッセージを作る
		JLabel lblNewLabel = new JLabel("メッセージ");
		panel_1.add(lblNewLabel);
		//テキストフィールドを作る
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(170, 6, 304, 26);
		getContentPane().add(b);
		//ボタンを作る
		a = new JButton("～送信～");
		a.setBounds(6, 71, 468, 47);
		getContentPane().add(a);
		//クリックイベント
		a.addActionListener(this);
		//テーブルに設定する列名の作成
		String[] header = {"名前","メッセージ"};
		tm = new DefaultTableModel(header,0);
		//JTableの作成
		table_1 = new JTable(tm);
		table_1.setBounds(6, 130, 468, 482);
		//作成したJTableにスクロール機能を設定
		JScrollPane scroll = new JScrollPane(table_1, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
		scroll.setBounds(6, 130, 468, 342);
		getContentPane().add(scroll);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == a)
		{
		String a = String.format("%s. %s.\n",
				b,c);
		}
	}
}
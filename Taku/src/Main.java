

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
		//�{�^���ŕ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		this.setSize(new Dimension(480, 500));
		getContentPane().setLayout(null);
		//�p�l�������
		JPanel panel = new JPanel();
		panel.setBounds(126, 6, 39, 26);
		getContentPane().add(panel);
		//���x���Ŗ��O�����
		JLabel label = new JLabel("���O");
		panel.add(label);
		//�e�L�X�g�t�B�[���h�����
		c = new JTextField();
		c.setColumns(10);
		c.setBounds(170, 33, 304, 26);
		getContentPane().add(c);
		//�p�l�������
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(84, 33, 81, 26);
		getContentPane().add(panel_1);
		//���x���Ń��b�Z�[�W�����
		JLabel lblNewLabel = new JLabel("���b�Z�[�W");
		panel_1.add(lblNewLabel);
		//�e�L�X�g�t�B�[���h�����
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(170, 6, 304, 26);
		getContentPane().add(b);
		//�{�^�������
		a = new JButton("�`���M�`");
		a.setBounds(6, 71, 468, 47);
		getContentPane().add(a);
		//�N���b�N�C�x���g
		a.addActionListener(this);
		//�e�[�u���ɐݒ肷��񖼂̍쐬
		String[] header = {"���O","���b�Z�[�W"};
		tm = new DefaultTableModel(header,0);
		//JTable�̍쐬
		table_1 = new JTable(tm);
		table_1.setBounds(6, 130, 468, 482);
		//�쐬����JTable�ɃX�N���[���@�\��ݒ�
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
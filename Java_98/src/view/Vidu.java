package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

public class Vidu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTiLMai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vidu frame = new Vidu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vidu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTiLMai = new JTextField();
		txtTiLMai.setText("tôi là Mai Long Vỹ");
		txtTiLMai.setBounds(117, 135, 295, 91);
		contentPane.add(txtTiLMai);
		txtTiLMai.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(187, 263, 141, 83);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ví dụ\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(234, 46, 61, 32);
		contentPane.add(lblNewLabel);
		
		this.setVisible(true);
	}
}

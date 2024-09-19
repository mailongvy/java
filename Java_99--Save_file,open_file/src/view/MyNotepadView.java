package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MyNotepadController;
import model.MyNotepadModel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyNotepadView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public MyNotepadModel myNotepadmodel;
	public JLabel lblNewLabel;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotepadView frame = new MyNotepadView();
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
	public MyNotepadView() {
		setVisible(true);
		this.myNotepadmodel = new MyNotepadModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		panel.setVerifyInputWhenFocusTarget(false);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 0, 409, 50);
		panel.add(lblNewLabel);
		
		ActionListener ac = new MyNotepadController(this);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(ac);
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOpen.setBounds(470, 17, 96, 23);
		panel.add(btnOpen);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(ac);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(595, 17, 96, 23);
		panel.add(btnSave);
		
		
		
		this.setVisible(true);
	}
}

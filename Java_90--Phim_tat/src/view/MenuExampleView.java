package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		
		this.setSize(600, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		ActionListener ac = new MenuExampleController(this);
		
//		để tạo ra thanh menu ta dùng công cụ JMenuBar
		JMenuBar JMenuBar = new JMenuBar();
		// trong menu có các mục chính thì dùng JMenu
		// trong menu chứa các thành phần con thì ta dùng JMenuItems
		
		JMenu JMenu_file = new JMenu("File");
		JMenuItem JMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		JMenuItem_new.addActionListener(ac);
		JMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem JMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		JMenuItem_open.addActionListener(ac);
		JMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem JMenuItem_exit= new JMenuItem("Exit", KeyEvent.VK_X);
		JMenuItem_exit.addActionListener(ac);
		JMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		
		JMenu_file.add(JMenuItem_new);
		JMenu_file.add(JMenuItem_open);
		JMenu_file.addSeparator();
		JMenu_file.add(JMenuItem_exit);
		
		
		
		
		JMenu JMenu_help = new JMenu("Help");
		JMenuItem JMenuItem_welcome = new JMenuItem("Welcome");
		JMenuItem_welcome.addActionListener(ac);
		JMenu_help.add(JMenuItem_welcome);
		
		// sau khi tạo các Jmenu thì add chúng vào cái JMenuBar
		JMenuBar.add(JMenu_file);
		JMenuBar.add(JMenu_help);
		
		// để thêm menu vào chương trình thì dùng hàm setJMenuBar
		this.setJMenuBar(JMenuBar);
		
		// tạo label hiển thị
		Font font = new Font("Arial", Font.BOLD, 14);
		jLabel = new JLabel();
		
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.CENTER);
		
		
		
		this.setVisible(true);
	}
	
	public void setText_JLabel(String s) {
		this.jLabel.setText(s);
	}
}

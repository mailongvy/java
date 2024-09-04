package view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame{
	private JMenu menu;
	private JMenu submenu;
	JMenuBar mb = new JMenuBar();
	private JMenuItem i1;
	private JMenuItem i2;
	private JMenuItem i3;
	private JMenuItem i4;
	private JMenuItem i5;
	private JLabel jLbael;
	private JButton jButton;

	public MainView() {
		this.setTitle("MLV");
		
		this.setSize(600, 600);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		//set icon cho JFrame
		URL url_icon_notepad = MainView.class.getResource("notepad-icon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon_notepad);
		this.setIconImage(img);
		
		// Jmenubar
		menu = new JMenu("Menu");
		i1 = new JMenuItem("New");
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("new-icon.png"))));
		i2 = new JMenuItem("Save");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save-icon.png"))));
		i3 = new JMenuItem("Save as");
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save-as-icon.png"))));
		i4 = new JMenuItem("Exit");
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("exit-icon.png"))));
		i5 = new JMenuItem("Test");
		i5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("test-icon.png"))));
		submenu = new JMenu("Sub menu");
		submenu.add(i4);
		submenu.add(i5);
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(submenu);
		mb.add(menu);
		
		//JLabel
		jLbael = new JLabel();
		jLbael.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("main-image.png"))));
		
		//JButton
		jButton = new JButton("TEST BUTTON");
		jButton.setSize(50, 50);
		
		this.setJMenuBar(mb);
		this.add(jLbael, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);
		this.setVisible(true);
	}
}

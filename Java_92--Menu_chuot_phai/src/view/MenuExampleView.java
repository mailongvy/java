package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListenner;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		
		this.setSize(600, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		
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
		
		// tạo tool bar (thanh công cụ)
		// Sử dụng class JToolBar
		JToolBar JToolBar = new JToolBar();
		// thanh công cụ thường chứa các nút nhấn hoặc các biểu tượng để điều khiển
		JButton JButton_Undo =  new JButton("Undo");
		JButton_Undo.addActionListener(ac);
		JButton JButton_Redo =  new JButton("Redo");
		JButton_Redo.addActionListener(ac);
		JButton JButton_Copy =  new JButton("Copy");
		JButton_Copy.addActionListener(ac);
		JButton JButton_Cut =  new JButton("Cut");
		JButton_Cut.addActionListener(ac);
		JButton JButton_Paste =  new JButton("Paste");
		JButton_Paste.addActionListener(ac);
		JToolBar.add(JButton_Undo);
		JToolBar.add(JButton_Redo);
		JToolBar.add(JButton_Copy);
		JToolBar.add(JButton_Cut);
		JToolBar.add(JButton_Paste);
		
		// đưa thanh công cụ vào màn hình chính
		this.add(JToolBar, BorderLayout.NORTH);
		
		//muốn tạo menu chuột phải thì dung công cụ JPopupMenu giống như JMenuBar
		// Menu chuột phải JPopupMenu

				jPopupMenu = new JPopupMenu();
				
				JMenu jMenuPoupFont = new JMenu("Font");
				JMenuItem jMenuItemType = new JMenuItem("Type");
				jMenuItemType.addActionListener(ac);
				JMenuItem jMenuItemSize = new JMenuItem("Size");
				jMenuItemSize.addActionListener(ac);
				jMenuPoupFont.add(jMenuItemType);
				jMenuPoupFont.add(jMenuItemSize);
				
				JMenuItem jMenuItemCut = new JMenuItem("Cut");
				jMenuItemCut.addActionListener(ac);
				JMenuItem jMenuItemCopy = new JMenuItem("Copy");
				jMenuItemCopy.addActionListener(ac);
				JMenuItem jMenuItemPaste = new JMenuItem("Paste");
				jMenuItemPaste.addActionListener(ac);
				
				jPopupMenu.add(jMenuPoupFont);
				jPopupMenu.addSeparator();
				jPopupMenu.add(jMenuItemCut);
				jPopupMenu.add(jMenuItemCopy);
				jPopupMenu.add(jMenuItemPaste);
				
				this.add(jPopupMenu);
//		jPopupMenu = new JPopupMenu();
//		 
//		JMenu JMenuPopup_Font = new JMenu("Font");
//		JMenuItem JMenuItem_Type = new JMenu("Type");
//		JMenuItem_Type.addActionListener(ac);
//		JMenuItem JMenuItem_Size = new JMenu("Size");
//		JMenuItem_Size.addActionListener(ac);
//		JMenuPopup_Font.add(JMenuItem_Type);
//		JMenuPopup_Font.add(JMenuItem_Size);
//		
//		JMenuItem JMenuItem_Cut = new JMenu("Cut");
//		JMenuItem_Cut.addActionListener(ac);
//		JMenuItem JMenuItem_Copy = new JMenu("Copy");
//		JMenuItem_Copy.addActionListener(ac);
//		JMenuItem JMenuItem_Paste = new JMenu("Paste");
//		JMenuItem_Paste.addActionListener(ac);
//
//		jPopupMenu.add(JMenuPopup_Font);
//		jPopupMenu.add(JMenuItem_Cut);
//		jPopupMenu.add(JMenuItem_Copy);
//		jPopupMenu.add(JMenuItem_Paste);
//		 
//		this.add(jPopupMenu);

		
		MenuExampleMouseListenner menuExampleMouseListenner = new MenuExampleMouseListenner(this);
//		jPopupMenu.addMouseListener(menuExampleMouseListenner);
		this.addMouseListener(menuExampleMouseListenner);
		
		// tạo label hiển thị
		jLabel = new JLabel();
		
		
		
		this.add(jLabel, BorderLayout.CENTER);
		
		
		
		this.setVisible(true);
	}
	
	public void setText_JLabel(String s) {
		this.jLabel.setText(s);
	}
}

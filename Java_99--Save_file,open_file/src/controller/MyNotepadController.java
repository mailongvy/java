package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener {
	MyNotepadView myNotepadView;
	
	
	public MyNotepadController(MyNotepadView myNotepadView) {
		super();
		this.myNotepadView = myNotepadView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		System.out.println(command);
		if (command.equals("Open")) {
			int returnval = fc.showOpenDialog(this.myNotepadView);
			//approve option là người dùng chọn file
			//exit option là người dùng nhấn cancel
			if (returnval == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String filename = file.getName();
				this.myNotepadView.myNotepadmodel.setFileName(file.getAbsolutePath());
				this.myNotepadView.lblNewLabel.setText(this.myNotepadView.myNotepadmodel.getFileName());
				// nếu là địng dạng txt thì lấy hết dữ liệu lên
				if (filename.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String res = "";
						for (String line : allText) {
							System.out.println(line);
							res += line;
							res += "\n";
							
						} 
						this.myNotepadView.myNotepadmodel.setContent(res);
						this.myNotepadView.textArea.setText(this.myNotepadView.myNotepadmodel.getContent());
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				
			}
		}
		else if (command.equals("Save")) {
			if(this.myNotepadView.myNotepadmodel.getFileName() != null) {
				save(this.myNotepadView.myNotepadmodel.getFileName());
			} else {
				int returnVal = fc.showSaveDialog(this.myNotepadView);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					save(file.getAbsolutePath());
				} 
			}
		}
		
	}


	public void save(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.myNotepadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
		
}

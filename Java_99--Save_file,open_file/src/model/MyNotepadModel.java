package model;

public class MyNotepadModel {
	private String fileName;
	private String content;
	public MyNotepadModel() {
		super();
	}
	public MyNotepadModel(String fileName, String content) {
		super();
		this.fileName = fileName;
		this.content = content;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}

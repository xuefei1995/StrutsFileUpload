package com.xuefei.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DownAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private String saveDir;//文件保存目录
	private String filename;//文件名字

	public void setFilename(String filename) {
		this.filename = filename;
	}
	//因为需要把filename提供给配置文件，所以必须提供这个get方法
	public String getFilename() {
		return filename;
	}

	public void setSaveDir(String saveDir) {
		this.saveDir = saveDir;
	}
	
	public String list() throws Exception {
		File file=new File(saveDir);
		String[] list = file.list();
		requestMap.put("list", list);
		return "list";
	}
	
	//向浏览器返回输入流
	public InputStream getInputStream() {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(saveDir+filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fis;
	}
	
	public String load() throws Exception {
		return "load";
	}
}

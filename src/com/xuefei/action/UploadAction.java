package com.xuefei.action;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class UploadAction extends BaseAction {
	
	private static final long serialVersionUID = 1L;
	
	private File file;//上传文件
	@SuppressWarnings("unused")
	private String fileContextType;//文件类型
	private String fileFileName;//文件名字
	private String info;//文件描述
	private String saveDir;//文件保存目录
	
	public void setSaveDir(String saveDir) {
		this.saveDir = saveDir;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void setFileContextType(String fileContextType) {
		this.fileContextType = fileContextType;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String upload() throws Exception{
		//将文件保存到硬盘，不用删除临时文件，struts2的FileUploadInterceptor拦截器会自动删除
		FileUtils.copyFile(file, new File(saveDir+fileFileName));
		System.out.println(info);
		return SUCCESS;
	}
	
}

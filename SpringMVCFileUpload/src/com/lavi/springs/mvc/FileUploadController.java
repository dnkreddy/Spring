package com.lavi.springs.mvc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class FileUploadController  {
	@RequestMapping(value="/fileUpload.lavi")
	public String getFileUploadPage(){
		System.out.println("In FileUploadController#getFileUploadPage");
		return "uploadFile";
	}
	@RequestMapping(value="/filesUpload.lavi")
	public String getFilesUploadPage(){
		System.out.println("In FileUploadController#getFilesUploadPage");
		return "uploadFiles";
	}
	
	@RequestMapping(value="/selectFile.lavi")
	public String processFile(@RequestParam("file") MultipartFile file,HttpServletRequest request){
		System.out.println("In FileUploadController#processFile");
		try{
		if(file.isEmpty()){
			request.setAttribute("MSG", "File is empty, Plz uplad the file");
			return "uploadFile";
		}else{
			File dir = new File("D:\\Lavi\\UploadedFiles");
			if(!dir.exists()){
				dir.mkdirs();
			}
			File uploadedFile = new File(dir,file.getOriginalFilename());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
			byte data [] = file.getBytes();
			stream.write(data);
			stream.close();
			request.setAttribute("MSG", "Your file "+file.getOriginalFilename()+" has been uploaded successfully in the path "+dir.getPath());
			return "uploadFile";
		}
		}catch(Exception e){
			request.setAttribute("MSG", "Error while processing the uploaded file");
			return "uploadFile";
		}
	}
	
	@RequestMapping(value="/selectFiles.lavi")
	public String processFiles(@RequestParam("file") MultipartFile files[],HttpServletRequest request){
		System.out.println("In FileUploadController#processFile");
		for(MultipartFile file: files){
		try{
		if(file.isEmpty()){
			request.setAttribute("MSG", "File is empty, Plz uplad the file");
			return "uploadFiles";
		}else{
			File dir = new File("D:\\Lavi\\UploadedFiles");
			if(!dir.exists()){
				dir.mkdirs();
			}
			File uploadedFile = new File(dir,file.getOriginalFilename());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
			byte data [] = file.getBytes();
			stream.write(data);
			stream.close();
			request.setAttribute("MSG", "Your files has been uploaded successfully in the path "+dir.getPath());
		}
		}catch(Exception e){
			request.setAttribute("MSG", "Error while processing the uploaded file");
			return "uploadFiles";
		}
		}
		return "uploadFiles";
	}
}

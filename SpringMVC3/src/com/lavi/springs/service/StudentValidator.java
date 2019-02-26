package com.lavi.springs.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.lavi.springs.modal.Student;
import com.lavi.springs.modal.StudentID;
@Component
public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clz) {
		System.out.println("#supports");
		System.out.println(Student.class.equals(clz));
		return false;
	}

	@Override
	public void validate(Object command, Errors errors) {
		System.out.println("#validate");
		StudentID stu = (StudentID)command;
		if(null == stu.getSid() || "".equals(stu.getSid())){
			errors.rejectValue("sid", "error.sid.required", "Student ID is Required");
		}else if(!stu.getSid().startsWith("Lavi-")){
			errors.rejectValue("sid", "error.sid.format", "Student ID Wrong format");
		}	
	}
}

package com.lavi.springs.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lavi.springs.exception.SIDNotFoundException;
import com.lavi.springs.modal.Student;
import com.lavi.springs.modal.StudentID;
import com.lavi.springs.service.StudentValidator;
@Controller
public class StudentController  {

	@Autowired
	private StudentValidator validator;
	
	@RequestMapping(value="/getsearch.lavi")
	public String getSearchPage(HttpServletRequest request){
		request.setAttribute("stu", new StudentID("Lavi-"));
		return "sidsearch";
	}
	
	@RequestMapping(value="/search.lavi")
	public String searchStudent(@ModelAttribute("stu") StudentID sid,BindingResult results, HttpServletRequest request){
		validator.validate(sid, results);
		if(results.hasErrors()){
			return "sidsearch";
		}else if(sid.getSid().startsWith("Lavi-")){
			String sidValue = sid.getSid();
			
			int id = Integer.parseInt(sidValue.substring(5));
			if(id>=1 && id<=99){
				Student stu = new Student();
				stu.setName("Lavi Student");
				stu.setEmail("lavi@lavi.com");
				stu.setPhone("123456789");
				stu.setSid(sidValue);
				request.setAttribute("student", stu);
				return "sidinfo";
			}else{
				request.setAttribute("stu", sid);
				SIDNotFoundException exception = new SIDNotFoundException("Student with id "+sid.getSid()+" is not found");
				request.setAttribute("MSG", exception.getMessage());
				throw exception;
			}
		}
		return "sidsearch";
	}
	
	//2nd way
	//@ExceptionHandler(SIDNotFoundException.class)
	public ModelAndView exceptionHandler(SIDNotFoundException exception){
		ModelAndView view = new ModelAndView();
		view.setViewName("sidsearch1");
		view.addObject(exception.getMessage());
		return view;
	}

}

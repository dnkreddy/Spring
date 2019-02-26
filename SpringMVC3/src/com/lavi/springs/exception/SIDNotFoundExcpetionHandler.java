package com.lavi.springs.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
/**
 * 2nd way
 * Defined handler to handle Excpetion from any controller class
 * @author LaVi Technologies
 *
 */
@ControllerAdvice
public class SIDNotFoundExcpetionHandler {
	
	@ExceptionHandler(SIDNotFoundException.class)
	public ModelAndView sidNotFound(SIDNotFoundException ex) {
		System.out.println("In Exception Handler");
		ModelAndView view = new ModelAndView();
		view.setViewName("sidsearch1");
		//view.addObject(ex.getMessage());
		return view;
	}

}

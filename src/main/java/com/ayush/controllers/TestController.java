package com.ayush.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ayush.dtos.StudentDTO;

@Controller
public class TestController {
	
	@GetMapping("/show_users")
	public ModelAndView showUsers() {
		ModelAndView mav = new ModelAndView();
		
		StudentDTO s1 = new StudentDTO("Kamlesh", 23, 'M', "GGITS");
		StudentDTO s2 = new StudentDTO("Raju", 3, 'M', "GGCT");
		StudentDTO s3 = new StudentDTO("Sumira", 13, 'F', "Global");
		StudentDTO s4 = new StudentDTO("Kavita", 32, 'F', "SRIT");
		StudentDTO s5 = new StudentDTO("Sunita", 2, 'F', "JEC");
		StudentDTO s6 = new StudentDTO("Harsh", 24, 'M', "KVC");
		
		mav.addObject("students", Arrays.asList(s1,s2,s3,s4,s5,s6));
		mav.setViewName("students");
		
		return mav;
	}
}

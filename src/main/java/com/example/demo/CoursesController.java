package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//this tells spring boot that this a controller class
public class CoursesController {
	@RequestMapping("/courses")
	//we also have @RequestBody to return hardcoded text onto the webpage
	public String courses(HttpServletRequest req) {//to read query params
		System.out.print("this is courses controller");
		
		String name=req.getParameter("name");
		HttpSession session=req.getSession();//will be available throughout the session
		session.setAttribute("name",name);
		//if we dont return jsp file we will get WhiteLabel error
		//to convert jsp into servlet we need to include jasper dependency
		return "course.jsp";
	}

}

package edu.cjc.sms.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.servicei.StudentServicei;

@Controller
public class AdminController {
	@Autowired private StudentServicei ssi;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
		
	}
	@RequestMapping("login")
	public String onlogin(@RequestParam("username") String username,
	                      @RequestParam("password") String password,
	                      Model m)
	{
	    if (username.equals("admin") && password.equals("admin"))
	    {
	        return "adminscreen";
	    }
	    else
	    {
	        m.addAttribute("login_fail", "Enter valid login details.");
	        return "login";
	    }
	}
	
	@RequestMapping("/enroll_student")
	public String saveStudent(@ModelAttribute Student student)
	{
	    ssi.saveStudentDetails(student);
	    return "adminscreen";
	}



}

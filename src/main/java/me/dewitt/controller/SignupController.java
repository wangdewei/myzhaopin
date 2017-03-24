package me.dewitt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.dewitt.pojo.Company;
import me.dewitt.pojo.User;
import me.dewitt.service.CompanyService;
import me.dewitt.service.UserService;

@Controller
public class SignupController {

	@Resource
	private UserService userService;
	
	@Resource
	private CompanyService companyService;
	
	@RequestMapping(value="UserSignup", method=RequestMethod.POST)
	public String userSignup(User user)
	{
		if(userService.insertUser(user))
			return "redirect:UserLogin";
		else
		{
			//todo:注册失败处理
			return "";
		}
	}
	@RequestMapping(value="UserSignup", method=RequestMethod.GET)
	public String userSignup()
	{
		return "UserSignup";
	}
	
	
	@RequestMapping(value="CompanySignup", method=RequestMethod.POST)
	public String companySignup(Company company)
	{
		if(companyService.insertCompany(company))
			return "redirect:CompanyLogin";
		else
		{
			//todo:注册失败处理
			return "";
		}
	}
	@RequestMapping(value="CompanySignup", method=RequestMethod.GET)
	public String CompanySignup()
	{
		return "CompanySignup";
	}
}

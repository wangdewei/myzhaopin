package me.dewitt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.SessionAttributes;

import me.dewitt.pojo.Company;
import me.dewitt.pojo.User;
import me.dewitt.service.CompanyService;
import me.dewitt.service.UserService;

@Controller
@SessionAttributes({"currUser", "currCompany"})
public class LoginController {
	@Resource
	private UserService userService;
	
	@Resource
	private CompanyService companyService;
	
	@RequestMapping(value="/UserLogin", method=RequestMethod.POST)
	public String userLogin(User userModel, ModelMap map)
	{
		User user = userService.getUserByUsernameAndPasswd(userModel);
		if(user != null)
		{
			map.addAttribute("currUser", user);
			return "redirect:home";
		}
		else
		{
			//todo:登录失败处理
			return "";
		}
	}
	@RequestMapping(value="/UserLogin", method=RequestMethod.GET)
	public String userLogin()
	{
		return "UserLogin";
	}
	
	@RequestMapping(value="/CompanyLogin", method=RequestMethod.POST)
	public String CompanyLogin(Company companyModel, ModelMap map)
	{
		Company company = companyService.getCompanyByAccountAndPasswd(companyModel);
		if(null != company)
		{
			map.addAttribute("currCompany", company);
			return "redirect:home";
		}
		else
		{
			//todo:登录失败处理
			return "";
		}
	}
	@RequestMapping(value="/CompanyLogin", method=RequestMethod.GET)
	public String companyLogin()
	{
		return "CompanyLogin";
	}
}

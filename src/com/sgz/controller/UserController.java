package com.sgz.controller;

import javax.servlet.http.HttpServletRequest;

import com.sgz.bean.User;
import com.sgz.service.UserService;
import com.webmvc.annotation.Autowire;
import com.webmvc.annotation.Controller;
import com.webmvc.annotation.RequestMapping;
import com.webmvc.annotation.RequestParam;
import com.webmvc.annotation.ResponseBody;
import com.webmvc.bean.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowire
	private HttpServletRequest req;
	@Autowire
	private UserService userService;
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return new String("/user/的index");
	}

	@RequestMapping("/say")
	@ResponseBody
	public User say() {
		User value = userService.say();
		return value;
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam("name") String name) {
		ModelAndView modelAndView = new ModelAndView("hello.jsp");
		modelAndView.addModel("name", "laozhou");
		System.out.println(req.getParameter("name"));
		return modelAndView;
	}
}

package com.sgz.controller;

import javax.servlet.http.HttpServletRequest;

import com.webmvc.annotation.Autowire;
import com.webmvc.annotation.Controller;
import com.webmvc.annotation.RequestMapping;
import com.webmvc.annotation.RequestParam;
import com.webmvc.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowire
	private HttpServletRequest req;

	@RequestMapping("/")
	@ResponseBody
	public String index(@RequestParam(value="name" , defaultValue = "sgz") String name, 
			@RequestParam(value = "age",  defaultValue = "20") int age) {
		String s;
		System.out.println((s = req.getParameter("name")) == null ? "没有获取到参数name": s);
		return new String(name + "---" + age);
	}
}

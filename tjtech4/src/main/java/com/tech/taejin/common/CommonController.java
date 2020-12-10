package com.tech.taejin.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	@RequestMapping("/")
	public String viewHome() {
		
		return "common/home";
	}

}

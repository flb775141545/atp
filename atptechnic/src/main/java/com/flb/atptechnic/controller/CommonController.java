package com.flb.atptechnic.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/atptechnic")
public class CommonController
{
	@RequestMapping(value = "/manager/index")
	public ModelAndView index(HttpServletRequest request){
		return new ModelAndView("/manager/index");
	}
}

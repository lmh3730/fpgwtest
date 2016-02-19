package com.kitri.fpgw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kitri.fpgw.service.ApprService;
import com.kitri.fpgw.service.MainService;

@Controller
@RequestMapping(value="/settlement")
public class ApprController {

	@Autowired
	/*private MainService MainService;*/
	private ApprService ApprService;
	
	@RequestMapping(value="/main.html")
	public ModelAndView settlementnocnt(){
		int a = ApprService.settlementnocnt();
		ModelAndView mav = new ModelAndView();
		System.out.println("appr메인작동");
		System.out.println(a);
		mav.addObject("migyul",a);
		mav.setViewName("/jsp/settlement/settlementmain");
		
		return mav;
	}
	

	
	
}

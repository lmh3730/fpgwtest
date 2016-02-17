package com.kitri.fpgw.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kitri.fpgw.model.CodeManageDto;
import com.kitri.fpgw.model.MenuDto;
import com.kitri.fpgw.model.UserDto;
import com.kitri.fpgw.service.MainService;

@Controller
@RequestMapping(value="/main")
public class MainController {

	@Autowired
	private MainService MainService;

	@RequestMapping(value="/index.html")
	public String Index(){
		
		return "index";
	}
	
	@RequestMapping(value="/login.html")
	public String Login(String id, String pwd, HttpSession session) throws Exception {
		
		UserDto userIn = new UserDto();
		userIn.setStrID(id);
		userIn.setStrPWD(pwd);
				
		UserDto userOut = MainService.Login(userIn);
		
		String strMovePage = "";

		if(userOut == null){
			
			session.setAttribute("success", "failed");
			strMovePage = "index";
		} else {
			
			session.setAttribute("success", "ok");
			session.setAttribute("userInfo", userOut);
			
			/*��������*/
			//1.ȸ������
			ArrayList<CodeManageDto> coInfo = MainService.CodeManageSelectBCode("001");
			session.setAttribute("coInfo", coInfo);
			
			//2.��������
			ArrayList<CodeManageDto> position = MainService.CodeManageSelectBCode("100");
			session.setAttribute("position", position);
			
			//�ѻ������(�޽��� ����Ʈ)
			ArrayList<UserDto> allUser = MainService.MainMessageList(userOut.getStrCode());
			session.setAttribute("allUser", allUser);
			
			//�޴�����
			ArrayList<MenuDto> listMenu = MainService.MenuSelectAll();
			session.setAttribute("menu", listMenu);
			
			
			strMovePage = "jsp/main/default";
		}
		
		return strMovePage;
	}
	
	@RequestMapping(value="logout.html")
	public String LogOut(HttpSession session){
		
		//��������
		session.removeAttribute("success");
		session.removeAttribute("userInfo");
		session.removeAttribute("coInfo");
		session.removeAttribute("position");
		session.removeAttribute("menu");
		
		return "index";
	}
	
	
	
}

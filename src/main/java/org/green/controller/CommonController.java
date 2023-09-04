package org.green.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("���ٰź� : " + auth);
		model.addAttribute("msg","���ٰź�");

	}
	@GetMapping("/customLogin")
	public void loginTnput(String erorr,String logout, Model model) {
		log.info("���� : "+ erorr);
		log.info("�α׾ƿ� : "+ logout);

		//���� �������
		if(erorr != null) {
			model.addAttribute("error","�α��ο���");
		}
		if(logout != null) {
			model.addAttribute("logout","�α׾ƿ�!");
		}
	}	
	@GetMapping("/customLogout")
	public void logoutGet() {
		log.info("�α׾ƿ�");
	}
}

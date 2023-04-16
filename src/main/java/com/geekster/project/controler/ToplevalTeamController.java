package com.geekster.project.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.geekster.project.EmailApp.HandleSend;
import com.geekster.project.services.Allservices;

public class ToplevalTeamController {
	
	
	
	@Autowired
	private Allservices services;
	
	@Autowired
	private HandleSend handle;
	
	@GetMapping("/topleval")
	public String send_Mail() {
		
		handle.sendAttachment(4);
		
		return services.sendmailToToplevalteams();
	}

}

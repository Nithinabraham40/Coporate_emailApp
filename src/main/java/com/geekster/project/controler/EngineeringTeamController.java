package com.geekster.project.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.project.EmailApp.HandleSend;
import com.geekster.project.services.Allservices;

@RestController
public class EngineeringTeamController {
	
	
	@Autowired
	private Allservices services;
	@Autowired
	private HandleSend handle;
	
	@GetMapping("/engineers")
	public String send_Mail() {
		
		
		handle.sendAttachment(1);
		
		return services.sendmailToEngineers();
	}
	
	

}

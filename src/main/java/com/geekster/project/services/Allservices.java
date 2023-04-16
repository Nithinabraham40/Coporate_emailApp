package com.geekster.project.services;

import org.springframework.stereotype.Service;

import com.geekster.project.Allclass.EngineeringTeam;
import com.geekster.project.Allclass.ManagmentTeam;
import com.geekster.project.Allclass.ShareHolders;
import com.geekster.project.Allclass.ToplevalTeams;


@Service
public class Allservices {
	
	EngineeringTeam eng1=new EngineeringTeam("Nithin Abraham", 256, "abrahamnithin40@gmail.com", 1);
	ManagmentTeam m1=new ManagmentTeam("Aman varma","nithinabraham222@gmail.com", 24, 8);
	ShareHolders h1 = new ShareHolders("Karthik V", "10%", "vk@gmail.com");
	ToplevalTeams t1=new ToplevalTeams("Surya JU", "Sju@gmail.com", "14");
	
	
	
	public String sendmailToEngineers() {
		
		return "sending mail to "+eng1.getEng_EmployMailId();
	}
	
	public String sendmailToManagment() {
		
		return "sending mail to "+m1.getManagmentemploye_MailId();
	}
	public String sendmailToShareHolders() {
		
		return "sending mail to "+h1.getShareholder_MailId();
		
	}
	public String sendmailToToplevalteams() {
		
		return "sending mail to "+t1.getToplevalemploye_Mailid();
	}

	public String  getEng_mail() {
		return eng1.getEng_EmployMailId();
	}
	

	public String  getManagment_mail() {
		return m1.getManagmentemploye_MailId();
	}
	public String getShareholders_mail() {
		return h1.getShareholder_MailId();
	}
	
	public String getTopleval_mail() {
		return t1.getToplevalemploye_Mailid();
	}
	public String sendMailSubject(int a) {
		if(a==1) {
			return "sending mail to "+eng1.getEng_EmployMailId();
		}else if(a==2) {
			return "sending mail to "+m1.getManagmentemploye_MailId();
		}
		else if(a==3) {
			return "sending mail to "+h1.getShareholder_MailId();
		}else {
			return "sending mail to "+t1.getToplevalemploye_Mailid();
		}
		
	}
	public String mailId(int a) {
		
		if(a==1) {
			return eng1.getEng_EmployMailId();
		}else if(a==2) {
			return m1.getManagmentemploye_MailId();
		}else if(a==3) {
			return h1.getShareholder_MailId();
		}else {
			return t1.getToplevalemploye_Mailid();
		}
	}

}

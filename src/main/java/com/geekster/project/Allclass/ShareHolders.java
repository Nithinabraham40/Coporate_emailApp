package com.geekster.project.Allclass;

public class ShareHolders {
	
	private String shareholder_Name;
	private String shareholder_percentage;
	private String shareholder_MailId;
	public ShareHolders(String shareholder_Name, String shareholder_percentage, String shareholder_MailId) {
	
		this.shareholder_Name = shareholder_Name;
		this.shareholder_percentage = shareholder_percentage;
		this.shareholder_MailId = shareholder_MailId;
	}
	public String getShareholder_Name() {
		return shareholder_Name;
	}
	public void setShareholder_Name(String shareholder_Name) {
		this.shareholder_Name = shareholder_Name;
	}
	public String getShareholder_percentage() {
		return shareholder_percentage;
	}
	public void setShareholder_percentage(String shareholder_percentage) {
		this.shareholder_percentage = shareholder_percentage;
	}
	public String getShareholder_MailId() {
		return shareholder_MailId;
	}
	public void setShareholder_MailId(String shareholder_MailId) {
		this.shareholder_MailId = shareholder_MailId;
	}
	
	
	

}

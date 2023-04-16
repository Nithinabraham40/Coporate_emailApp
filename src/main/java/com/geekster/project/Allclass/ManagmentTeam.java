package com.geekster.project.Allclass;

public class ManagmentTeam {
	
	private String managmentemploye_Name;
	private String managmentemploye_MailId;
	private int managmentemploye_id;
	private int managmentemploye_experience;
	public ManagmentTeam(String managmentemploye_Name, String managmentemploye_MailId, int managmentemploye_id,
			int managmentemploye_experience) {
		
		this.managmentemploye_Name = managmentemploye_Name;
		this.managmentemploye_MailId = managmentemploye_MailId;
		this.managmentemploye_id = managmentemploye_id;
		this.managmentemploye_experience = managmentemploye_experience;
	}
	public String getManagmentemploye_Name() {
		return managmentemploye_Name;
	}
	public void setManagmentemploye_Name(String managmentemploye_Name) {
		this.managmentemploye_Name = managmentemploye_Name;
	}
	public String getManagmentemploye_MailId() {
		return managmentemploye_MailId;
	}
	public void setManagmentemploye_MailId(String managmentemploye_MailId) {
		this.managmentemploye_MailId = managmentemploye_MailId;
	}
	public int getManagmentemploye_id() {
		return managmentemploye_id;
	}
	public void setManagmentemploye_id(int managmentemploye_id) {
		this.managmentemploye_id = managmentemploye_id;
	}
	public int getManagmentemploye_experience() {
		return managmentemploye_experience;
	}
	public void setManagmentemploye_experience(int managmentemploye_experience) {
		this.managmentemploye_experience = managmentemploye_experience;
	}
	
	
	

}

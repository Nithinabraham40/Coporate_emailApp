package com.geekster.project.Allclass;

public class EngineeringTeam {
	
	private String eng_Employename;
	private int  eng_EmployId;
	private String eng_EmployMailId;
	private int eng_EmployeExperience;
	public EngineeringTeam(String eng_Employename, int eng_EmployId, String eng_EmployMailId,
			int eng_EmployeExperience) {
		
		this.eng_Employename = eng_Employename;
		this.eng_EmployId = eng_EmployId;
		this.eng_EmployMailId = eng_EmployMailId;
		this.eng_EmployeExperience = eng_EmployeExperience;
	}
	public String getEng_Employename() {
		return eng_Employename;
	}
	public void setEng_Employename(String eng_Employename) {
		this.eng_Employename = eng_Employename;
	}
	public int getEng_EmployId() {
		return eng_EmployId;
	}
	public void setEng_EmployId(int eng_EmployId) {
		this.eng_EmployId = eng_EmployId;
	}
	public String getEng_EmployMailId() {
		return eng_EmployMailId;
	}
	public void setEng_EmployMailId(String eng_EmployMailId) {
		this.eng_EmployMailId = eng_EmployMailId;
	}
	public int getEng_EmployeExperience() {
		return eng_EmployeExperience;
	}
	public void setEng_EmployeExperience(int eng_EmployeExperience) {
		this.eng_EmployeExperience = eng_EmployeExperience;
	}
	
	
	

}

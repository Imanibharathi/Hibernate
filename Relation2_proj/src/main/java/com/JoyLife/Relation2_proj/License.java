package com.JoyLife.Relation2_proj;

public class License {
	private int LicenseId;
	private String Issuedate;
	private String Expiredate;
	private Person person;
	public int getLicenseId() {
		return LicenseId;
	}
	public void setLicenseId(int licenseId) {
		LicenseId = licenseId;
	}
	public String getIssuedate() {
		return Issuedate;
	}
	public void setIssuedate(String issuedate) {
		Issuedate = issuedate;
	}
	public String getExpiredate() {
		return Expiredate;
	}
	public void setExpiredate(String expiredate) {
		Expiredate = expiredate;
	}
	public License() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}

package com.springcore.referencetype;

public class IPL {
	
	private String sponsor;
	private BCCI funds;
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public BCCI getFunds() {
		return funds;
	}
	public void setFunds(BCCI funds) {
		this.funds = funds;
	}
	@Override
	public String toString() {
		return "IPL [sponsor=" + sponsor + ", funds=" + funds + "]";
	}
	
	

}

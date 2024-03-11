package com.prudhvi.strategy_design_pattern.version1;

public class To extends Location{
	String to;
	
	
	public To(String to) {
		super();
		this.to = to;
	}
	public To (String to, double latitude, double longitude) {
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.to = to;
		
	}
	

	public To() {
		super();
	}


	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	

}

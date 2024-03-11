package com.prudhvi.strategy_design_pattern.version1;

public class From extends Location{
	String from;

	public String getFrom() {
		return from;
	}
	public From (String to, double latitude, double longitude) {
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.from = to;
		
	}

	public void setFrom(String from) {
		this.from = from;
	}
	

}

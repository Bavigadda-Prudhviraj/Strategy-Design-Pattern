package com.prudhvi.strategy_design_pattern.version1;

public class Path {
	
    private double distance;
    private To to;
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public To getTo() {
		return to;
	}
	public void setTo(To to) {
		this.to = to;
	}
	public Path(double distance, To to) {
		super();
		this.distance = distance;
		this.to = to;
	}
	
    

}

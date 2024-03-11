package com.prudhvi.strategy_design_pattern.version1;

public class GetShortestPath {
	public Path getShortestPath(String mode, From from, To to) {
		if(Mode.CAR.equals(mode.toUpperCase())) {
			CarPath carPath = new CarPath();
			Path path = carPath.findCarPath(from, to);
			return path;
		}else if(Mode.BIKE.equals(mode.toUpperCase())){
			BikePath bikePath = new BikePath();
			Path path = bikePath.findBikePath(from, to);
			return path;
			
		}else if(Mode.WALK.equals(mode.toUpperCase())) {
			WalkPath walkPath = new WalkPath();
			Path path = walkPath.findWalkPath(from, to);
			return path;
			
		}
		return null;
		
	}
}

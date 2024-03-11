package com.prudhvi.strategy_design_pattern.version1;

public class Client {
	/*
      in this we are using getShotest path object to get the shortest path
      in the getShortest path class there are multiple condition are written and logic is written in side it only 
      it is violating
      	1. SRP ( there are multiple condition is written)
      	2. OCP ( if another way comes means we have to change so many things
      	3. DIP ( we create an strongly coupled object of the way it is not the best way)
	
	 */

	public static void main(String[] args) {
		String fromLocation = "Delhi";
		double fromLongitude = 40.366633; 
		double FromLatitude =  74.640832;
		String toLocation = "Bengaluru";
		double toLongitude = 40.366633; 
		double toLatitude =  74.640832;
		
		From from = new From(fromLocation, FromLatitude, fromLongitude);
		To to = new To(toLocation, toLatitude,toLongitude);
		GetShortestPath shortestPath = new GetShortestPath();
		Path bikePath = shortestPath.getShortestPath("BiKe", from, to);
		Path carPath = shortestPath.getShortestPath("Car", from, to);
		Path walkPath = shortestPath.getShortestPath("Walk", from, to);

	}

}

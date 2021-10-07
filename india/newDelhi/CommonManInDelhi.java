package Oops.india.newDelhi;

import Oops.tamilnadu.chennai.TrafficRulesChennai;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRulesChennai {

	
	public static void main(String[] args) {
		CommonManInDelhi cmd = new CommonManInDelhi();
		cmd.dontGoBydieselVehicle();
		cmd.goByBicycle();
		cmd.goByDieselVehicle();
	}
	
	public void dontGoBydieselVehicle() {
	
System.out.println("dontGoBydieselVehicle");
	}


	public void goByBicycle() {
		System.out.println("2goByBicycle");

	}

	public void goByDieselVehicle() {
		System.out.println("2goByDieselVehicle");
		
	}

	

}

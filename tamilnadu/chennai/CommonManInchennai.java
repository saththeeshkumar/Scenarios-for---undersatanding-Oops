package Oops.tamilnadu.chennai;

public  class CommonManInchennai implements TrafficRulesChennai {

	public static void main(String[] args) {
	  CommonManInchennai cmc = new CommonManInchennai();
	  cmc.goByDieselVehicle();
	  cmc.goByBicycle();

	}

	
	public void goByDieselVehicle() {
		System.out.println("goByDieselVehicle");
		
	}

	
	public void goByBicycle() {
		System.out.println("goByBicycle");
		
	}

}

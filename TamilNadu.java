package Oops;

public class TamilNadu extends SouthIndia {
	static String capital = "chennai";
	public TamilNadu(String primeminister) {
		super("primeminister");
		}

	public static void main(String[] args){
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		SouthIndia si = new TamilNadu("Modiji");
		si.speaklanguage();
		si.eat();
		si.dress();
		si.cultivate();
		si.livingStyle();
	}

	void cultivate() {
		System.out.println("Rice and SugarCan Cultivation");
	}
	void livingStyle() {
		System.out.println("Above average Developement");
	}
	void speaklanguage() {
		System.out.println("Tamil");
	}

	void eat() {
		System.out.println("Rise");
	}

	void dress() {
		System.out.println("Dhoties");
	}

}

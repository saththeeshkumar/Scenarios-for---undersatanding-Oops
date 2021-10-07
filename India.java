package Oops;
/*  understanding :Abstraction,inheritance,Dynamic Binding,Polymorphism(overriding),constructor overloading  */
public abstract class India {
	static String  capital = "NewDelhi";
	String primeminister;
	public India(String primeminister) {
		this.primeminister = primeminister;
		System.out.println("our prime Minister is " + primeminister);
	}
abstract void speaklanguage();
abstract void eat();
abstract void dress();
}

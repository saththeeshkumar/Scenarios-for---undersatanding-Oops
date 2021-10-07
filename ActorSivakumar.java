package Oops;

public class ActorSivakumar implements Actor {

static	String addrerss = "coimbator";

public ActorSivakumar() {

}

public ActorSivakumar(int model,String Brand) {
	
}
public static void main(String[] args) {
	ActorSivakumar as = new ActorSivakumar(65,"AudiCar");
	as.act();
	as.dance();
	as.sing();
	as.speaking();
	System.out.println(as.addrerss);
	Actor ac = new ActorSivakumar();
	ac.act();
	ac.dance();
	ac.sing();
  //  ((ActorSivakumar) ac).speaking();  -----> Definition  ().......
	System.out.println(ac.address);
	
}
 public void speaking() {
	System.out.println("this is speaking method in child class Actorsivakumar");

}
	public void act() {
		System.out.println("overrided act method");
	}


	public void dance() {
		System.out.println("overrided dance method");
	}

	
	public void sing() {
		System.out.println("overrided sing method");
	}

}

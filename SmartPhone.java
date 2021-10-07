package Oops;

public abstract class SmartPhone {

	abstract int call();
	abstract void sendMessage();
	abstract void receiveCall();
	
	public SmartPhone()
	{
		System.out.println("SmartPhone under Developement");
	}
	void browse()
	{
		System.out.println("Smart browsing");
	}
	
}

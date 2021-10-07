package Oops;

public abstract class FactoryDemo extends SmartPhone {

	boolean originalPiece = false;
	static int price = 0; 
	
	abstract void verifyFingerPrint();
	abstract void providePattern();
	void browse()
	{
		System.out.println("Factory Demo browsing");
	}
	
	int call() {
	
		return 0;
	}


	void sendMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub

	}

}

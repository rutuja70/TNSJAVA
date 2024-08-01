package tnsjava;

public class Demo {
public static void main(String []args) {
	Thread myT=new threadLife();
	System.out.println("before runnable alive or not"+myT.isAlive());
	myT.start();
	try {
		Thread.sleep(450);
	}
	catch(InterruptedException exp) {
		System.err.println(exp);
	}
	System.out.println("After completion execution alive or not"+myT.isAlive());
}
}

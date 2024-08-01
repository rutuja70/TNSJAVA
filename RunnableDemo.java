package tnsjava;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can not object but can create reference
usingrunnable r=new usingrunnable(10,1, "hii");
////		Runnable r1=new Runnable(r);
//		
//		Thread t1=new Thread(r);
//		t1.start();
//		
		
		Runnable r1=()->System.out.println(" runnable with lambda");
new Thread(r1).start();
new Thread(r).start();
	}

}

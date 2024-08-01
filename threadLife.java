package tnsjava;

public class threadLife extends Thread{

	public void run() {
		System.out.println("inside run "+this.isAlive());
		int num=0;
		while(num<4) {
			num++;
			System.out.println(isAlive());
		}
		try {
			sleep(500);
			System.out.println("in not ruunable "+this.isAlive());
		}
		catch(InterruptedException exp) {
			System.err.println("thread interrupted....");
		}
		
	}
}

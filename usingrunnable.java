package tnsjava;

public class usingrunnable implements Runnable{

	
	
	
	Thread t;
	int end , start;
	String msg;
	public usingrunnable(int end,int start,String msg) {
		super();
		this.end=end;
		this.start=start;
		this.msg=msg;
		
		
		t=new Thread(this, "child thread");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=end;i>start;i--) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println(" "+msg);
		}
	}

}

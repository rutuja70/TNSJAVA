package is;

public class PrimeNum {
public static void main(String args[]) {
	int i,m=0,flag=0,n;
	n=91;
	m=n/2;
	
	if(n==0 && n==1) {
		System.out.print("not prime ");
		
	
	}
	else {
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println("no ");
				flag=1;
				 break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("yes");
			flag=0;
		}
	}
	
}
}

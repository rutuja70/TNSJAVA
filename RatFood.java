package is;
import java.util.Scanner;
public class RatFood {
 
	public static int RatTotalFood(int[] arr,int r,int unit,int n) {

	
	if(n==0) {
		return -1;
	}
	int count=0;
	int sum=0;
	
	int totalFood=r*unit;
	
	for(int i=0;i<n-1;i++) {
		sum+=arr[i];
		count++;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	return 0;
	
	
	}
	public static void main(String args[]) {
		int r=7;
		int unit=2;
		System.out.print("enter size of array : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	System.out.print(" "+n);
	 System.out.println("" );
	int []arr=new int[n];
	 System.out.println("enter element : " );
	
	
	for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt()	;
	
	}

	 for(int i=0;i<n;i++) { 
		 System.out.print(arr[i]+ " ");
		
	 }
	  
	 
	 
	sc.close();

	 RatTotalFood(arr,n,r,unit);
	}
}

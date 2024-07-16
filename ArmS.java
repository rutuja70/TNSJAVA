package is;
import java.util.Scanner;
public class ArmS {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int original=n;
    int len=getOrder(n);
     int rem=0;
     int cub=0;
     while(n!=0){
         rem=n%10;
         cub=cub+(int)Math.pow(rem,len);
         n=n/10;
     }
     System.out.println(" "+cub);
     if(cub==original){
        System.out.print("true");
     }
     else{
         System.out.println("false");
     }
     sc.close();
}

private static int getOrder(int n) {
	// TODO Auto-generated method stub
	
	int len=0;
	while(n!=0) {
		len++;
		n=n/10;
	}
	return len;
}
}

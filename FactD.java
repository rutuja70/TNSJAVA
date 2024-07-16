package is;

public class FactD {
public static void main(String args[]) {
	//int N=5;
	fact(5);
}



static int fact(int N) {
	if(N==0)
        return 1;
	int res=1;
int fact=1;
     res+=N *fact(N-1);
    System.out.print(res);
     int count=0;
    while(res!=0){
     
       
        
        res=res/10;
         count++;
        
    }
    return count;
	
	
}
}

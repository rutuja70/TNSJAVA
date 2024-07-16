package is;

public class Facto {
public static void main(String args[]) {
	int n=13;
	int fact=1;

	while(n>0) {
		fact+=fact*(n-1);
		
		n--;
	}
	System.out.print(fact);
}
}

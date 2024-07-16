package is;
import java.util.Scanner;
public class RevStr {
public static void main(String args[]) {
	System.out.println("enter a string : ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String rev="";
	char ch;
	System.out.println(s);
	for(int i=0;i<s.length();i++) {
		ch=s.charAt(i);
		rev=ch+rev;
	}
	System.out.println("reversed string  : "+rev);
	sc.close();
}
}

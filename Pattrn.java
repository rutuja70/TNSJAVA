package is;
public class Pattrn {
public static void main(String args[]) {
	 int numRows=5;	
	 printPyramid(numRows);
}
public static void printPyramid(int numRows) {
	for(int i=1;i<=numRows;i++) {
		for(int j=1;j<=numRows-i;j++) {
		System.out.print(" ");
		}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
	}
}
}

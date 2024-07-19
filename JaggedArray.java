package is;

public class JaggedArray {
	
	
	class Jaaged{
		static void printArray(int d[][] ){
			
			for(int i=0;i<d.length;i++) {
				for(int j=0;j<d[i].length;j++) {
				
					System.out.print(d[i][j]+" ");
			}
				System.out.println(" ");
			}
		}
	}
	
	
public static void main(String args[]) {
	int d[][]= {{10,20,30,40},{20},{12,24},{30},{12,24},{1,2,3}};
System.out.println("total rows "+d.length);
Jaaged.printArray(d);


}





}

package is;

public class ArrayPractice {
//multidimensional array
	/*
	[ 1,5,8]
	[5,9,7]
	[6,4,2]
		*/
	
	
	

	class MLArray{
		static void printArray(int c[][] ){
			
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[i].length;j++) {
				
					System.out.print(c[i][j]+" ");
			}
				System.out.println(" ");
			}
		}
	}
	
	
	public static void main(String args[]) {
		int c[][]= {{12,45},{10,20},{5,7},{10,20},{5,7}};
		System.out.println("num of rows in c array ");
		MLArray.printArray(c);
	}

	
}

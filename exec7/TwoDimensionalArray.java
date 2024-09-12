package exec7;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] numArr2d= new int[3][3];
		
		
		for (int i =0;i<numArr2d.length;i++) {
			
			for (int j =0;j<numArr2d[i].length;j++) {
				numArr2d[i][j]=3*i+j+1;
				System.out.print("numArr2["+i+"]["+j+"]: "+numArr2d[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

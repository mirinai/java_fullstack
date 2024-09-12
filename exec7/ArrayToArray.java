package exec7;

public class ArrayToArray {
	public static void main(String[] args) {
		int[] oldArr = new int[3];

		int[] newArr = new int[5];

		for (int i = 0; i < oldArr.length; i++) {
			oldArr[i] = i + 1;
			System.out.println("oldArr[" + i + "]: " + oldArr[i]);
		}
		System.out.println();
//		newArr = oldArr;
//		newArr[0] = oldArr[0];
		
		
		System.out.println("newArr.length: "+newArr.length);
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
			System.out.println("newAArr[" + i + "]: " + newArr[i]);
		}
		
	}
}

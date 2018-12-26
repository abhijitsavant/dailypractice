
public class ArrayTest {

	public static void main(String[] args) {
		//int [][][] arr = new int[2][2][2];
		int[][] arr2D = {{1,2}};
		int[][][] arr3D  = {};
		
		int[][][] threeDArray = 
		    {  { {1,   2,  3}, { 4,  5,  6}, { 7,  8,  9} },
		       { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
		       { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} } 
		     };
		
		for (int[][] array2D: threeDArray) {
	        for (int[] array1D: array2D) {
	           for(int item: array1D) {
	              System.out.println(item);
	           }
	        }
	     }
	}

}

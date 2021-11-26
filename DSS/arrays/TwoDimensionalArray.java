package arrays;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		int[][] x1;
		int [][]x2;
		int x3[][];
		int[] []x4;
		int[] x5[];
		int []x6[];
		
		int[] a1,b1;
		int[] a2[],b2;
		int[] a3[],b3[];
		int[] []a4,b4;
		int[] []a5,b5[];
//		int[] []a6,[]b6; //CTE we can apply dimension before the variable for only first variable.
//		int[] []a,[]b,[]c; //here the dimension before the variable is allowed for only first varaible.
		
		int[][][] k1;
		int [][][]k2;
		int k3[][][];
		int[] [][]k4;
		int[] []k5[];
		int[][] []k6; 
		int[][] k7[];
		int [][]k8[];
		int []k9[][];
		
		int[][] x10 = new int[2][];
		x10[0] = new int[2];
		x10[1]= new int[3];
		
		int[][] m = new int[2][];
		System.out.println(m);
		System.out.println(m[0]);
		System.out.println(m[0][0]);

	}

}

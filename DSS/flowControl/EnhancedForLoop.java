package flowControl;

public class EnhancedForLoop {

	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30 };
//		for (int i : arr) {
//			System.out.println(i);
//		}

//		int[][] x = { { 10, 20, 30 }, { 40, 50 } };
//
//		for (int[] x1 : x) {
//			for (int x2 : x1) {
//				System.out.println(x2);
//			}
//		}

		int[][][] y = { { { 10, 20, 30 } }, { { 40, 50 } }, { { 60, 70 } } };

		for (int[][] y1 : y) {
			for (int[] y2 : y1) {
				for (int y3 : y2) {
					System.out.println(y3);
				}
			}
		}
	}
}

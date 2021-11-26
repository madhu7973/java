package transferStatements;

import com.sun.media.sound.SoftMixingSourceDataLine;

public class BreakStatement {

	public static void main(String[] args) {

		// int x = 10;
//		switch (x) {
//		case 0:
//			System.out.println("x=0");
//			break;
//		case 1:
//			System.out.println("x=1");
//			break;
//		default:
//			System.out.println("default");
//
//		}

//		for (int i = 0; i < 4; i++) {
//			if (i == 2)
//				break;
//			System.out.println(i);
//
//		}

//		block:
//		// System.out.println("begin");
//		for (int i = 0; i < 5; i++) {
//			if (x > 1)
//				break block;
//			System.out.println("end");
//		}

//		System.out.println("hi");
//
//		start: 
//		for (int i = 0; i <= 5; i++) {
//			if (i == 3)
//				continue start;
//			System.out.println(i);
//		}

//		block:
//			
//		for (int i = 0; i < 5; i++) {
//			while (i == 3) {
//				continue block;
//			}
//			System.out.println(i);
//		}

//		for (int i = 0; i < 5; i++) {
//			if (i == 3)
//				break;
//			System.out.println(i);
//
//		}

//		block: for (int i = 0; i < 5; i++) {
//			if (i == 3)
//				break block;
//			System.out.println(i);
//		}

//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0)
//				continue;
//			System.out.println(i);
//		}

//		label: for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				if (i == j)
//					continue label;
//				System.out.println(i + " " + j);
//			}
//		}

		int x = 0;

		do {
			x++;
			System.out.println(x);
			if (++x < 5)
				continue;
			x++;
			System.out.println(x);
		} while (++x < 10);

	}

}

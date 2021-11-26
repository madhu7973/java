package flowControl;

public class SwitchStatement {

	public static void main(String[] args) {

		int x = 3;
		final int y = 20;
		byte b = 10;
		int a = 97;
		String z = "May";

		String str = "QA";
		String str1 = "API";
		String str2 = "BED";
		String str3 = "FED";
		String str4 = "DevOps";

		switch (str) {
		case "QA":
			switch (str1) {
			case "Selenium":
				System.out.println("QA-Selenium");
				break;
			case "API":
				System.out.println("QA-API");
				break;
			case "Manual":
				System.out.println("QA-Manual");
				break;
			default:
				System.out.println("Non-QA");
				break;
			}

			break;
		case "BED":
			System.out.println("BED");
			break;
		case "FED":
			System.out.println("FED");
		default:
			System.out.println("DevOps");
			break;
		}

//		switch (x) {
//		default:
//			System.out.println("default");
//			
//		case 0:
//			System.out.println("case1");
//			
//		case 1:
//			System.out.println("case2");
//			break;
//		case 2:
//			System.out.println("case3");

	}

//		switch (b + 1) {
//		case 10:
//			System.out.println(10);
//			break;
//		case 100:
//			System.out.println(100);
//			break;
//		case 1000:
//			System.out.println(1000);
//			break;
//
//		default:
//			System.out.println("default");
//			break;
//		}

//		switch (a) {
//		case 97:
//			System.out.println(97);
//			break;
//		case 98:
//			System.out.println(98);
//			break;
//		case 'a':
//			System.out.println('a');
//			break;
//
//		default:
//			System.out.println("default");
//			break;
//		}

//		switch (z) {
//		case "Jan":
//
//		case "Feb":
//
//		case "Mar":
//			System.out.println("Q4");
//			break;
//
//		case "Apr":
//
//		case "May":
//
//		case "Jun":
//			System.out.println("Q1");
//			break;
//
//		case "Jul":
//
//		case "Aug":
//
//		case "Sep":
//			System.out.println("Q2");
//			break;
//
//		case "Oct":
//
//		case "Nov":
//
//		case "Dec":
//			System.out.println("Q3");
//			break;
//		default:
//			System.out.println("default");
//			break;
//		}
}

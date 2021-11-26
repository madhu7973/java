package exceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatch {

	public static void main(String[] args) {
		try {

			System.out.println(10 / 2);
//			FileInputStream fis = new FileInputStream("abc.txt");
//			String s = "abc";
//			System.out.println(s.charAt(13));

		}

		catch (ArithmeticException a) {
			System.out.println("results in infinity");
		}

//		catch (ArithmeticException a) {
//			a.printStackTrace();
//		}
//		catch (Exception e) {
//			System.out.println("Exceptions Hnadled");
//		}
//			catch (FileNotFoundException f) {
//			f.printStackTrace();
//		} 
//				catch (StringIndexOutOfBoundsException s) {
//			s.printStackTrace();
//		}

		System.out.println("end of program");
	}

}

package exceptionsHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingInV1_7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br1 = null;
		try {
			br1 = new BufferedReader(new FileReader("input.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br1 != null)
				br1.close();
		}

		try (BufferedReader br2 = new BufferedReader(new FileReader("input.txt"))) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

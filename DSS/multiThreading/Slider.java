package multiThreading;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("slide: " + i);
			Thread.sleep(1000);
		}

	}

}

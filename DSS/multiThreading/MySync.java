package multiThreading;

public class MySync extends Thread{
	Display d;
	String name;

	MySync(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.m1(name);
	}

}

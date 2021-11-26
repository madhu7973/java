package multiThreading;

public class MySyncBlock extends Thread{
	DisplaySyncBlock d;
	String name;
	
	public MySyncBlock(DisplaySyncBlock d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.m1(name);
	}

}

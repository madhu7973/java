package multiThreading;

public class SyncBlockDemo {

	public static void main(String[] args) {
		DisplaySyncBlock d1 = new DisplaySyncBlock();
		DisplaySyncBlock d2 = new DisplaySyncBlock();
		MySyncBlock msb1 = new MySyncBlock(d1, "madhu");
		MySyncBlock msb2 = new MySyncBlock(d2, "sudan");
		msb1.start();
		msb2.start();
	}
	
	
}

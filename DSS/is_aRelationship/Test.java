package is_aRelationship;

public class Test {
	
	public static void main(String[] args) {
		Super sup = new Super();
		sup.m1();
		sup.m2();
		//The method m2() is undefined for the type Super
		
		Sub sub = new Sub();
		sub.m1();
		sub.m2();
		
		Super sup1 = new Sub();
		sup1.m1();
		sup1.m2();
		//The method m2() is undefined for the type Super
		
		Sub sub1 = new Super(); 
		//Type mismatch: cannot convert from Super to Sub
	}
	
	

}

package coupling;

public class C {

	int m1() {
		Object o = new String ("java");
		StringBuffer sb = (StringBuffer) o; 
		return 10;
		

	}
}

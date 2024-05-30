package basicCodesForTheJavaDeveloper;

public class ThisKeyword2 {
	
	public static void main(String[] args) {
		ThisKeyword2 a1 = new ThisKeyword2();
		a1.test();
		ThisKeyword2 a2 = new ThisKeyword2();
		a2.test();
	}
	public void test() {
		System.out.println(this);
	}

}

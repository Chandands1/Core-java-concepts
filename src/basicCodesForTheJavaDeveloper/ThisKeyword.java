package basicCodesForTheJavaDeveloper;

public class ThisKeyword {
	
	public static void main(String[] args) {
		ThisKeyword a1 = new ThisKeyword();
		System.out.println(a1);
		a1.test();
		
	}
	public  void test() {
		System.out.println(this);
		
	}

}

package basicCodesForTheJavaDeveloper;

public class ThisKeyword1 {
	int x = 10;

	public static void main(String[] args) {
		ThisKeyword1 a1 = new ThisKeyword1();
		System.out.println(a1.x);
		a1.test();

	}

	public void test() {
		System.out.println(this.x);

	}

}

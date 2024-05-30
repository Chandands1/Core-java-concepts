package basicCodesForTheJavaDeveloper;

public class MethodArguments1 {
	public static void main(String[] args) {
		MethodArguments1.test(10, 0.5f, "Ram", true);
		
	}
	public static void test(int i, float f, String str, boolean b) {
		System.out.println(i);
		System.out.println(f);
		System.out.println(str);
		System.out.println(b);
	}

}

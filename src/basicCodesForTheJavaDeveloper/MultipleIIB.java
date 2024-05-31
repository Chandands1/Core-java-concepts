package basicCodesForTheJavaDeveloper;

public class MultipleIIB {
	{
		System.out.println("From IIB-2");
	}
	MultipleIIB(){
		System.out.println("From the constructor");
	}
	{
		System.out.println("From IIB-1");
	}
	public static void main(String[] args) {
		MultipleIIB multipleIIB = new MultipleIIB();
		System.out.println("From the main");
	}

}

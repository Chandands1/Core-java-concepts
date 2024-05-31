package basicCodesForTheJavaDeveloper;

public class IIBConstructorMain {
	
	IIBConstructorMain(){
		System.out.println("From the Constructor");
		
	}
	{
		System.out.println("From the IIB");
	}
	
	public static void main(String[] args) {
		System.out.println("From Start the main");
		IIBConstructorMain iibConstructorMain = new IIBConstructorMain();
		System.out.println("From End the main");
	
	}

}

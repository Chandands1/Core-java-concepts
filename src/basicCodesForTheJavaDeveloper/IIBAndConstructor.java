package basicCodesForTheJavaDeveloper;

public class IIBAndConstructor {
	{
		System.out.println("From IIB");
		
	}
	IIBAndConstructor(){
		System.out.println("From Constructor");
	}
	public static void main(String[] args) {
		IIBAndConstructor iibAndConstructor = new IIBAndConstructor();
	}

}

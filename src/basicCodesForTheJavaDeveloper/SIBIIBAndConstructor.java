package basicCodesForTheJavaDeveloper;

public class SIBIIBAndConstructor {
	public static void main(String[] args) {
		SIBIIBAndConstructor sibiibAndConstructor = new SIBIIBAndConstructor();
	}
	SIBIIBAndConstructor(){
		System.out.println("From the constructor");
	}
	{
		System.out.println("From IIB");
	}
	static {
		System.out.println("From SIB");
	}
}

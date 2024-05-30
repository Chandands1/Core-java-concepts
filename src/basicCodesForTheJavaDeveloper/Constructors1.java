package basicCodesForTheJavaDeveloper;

public class Constructors1 {
	Constructors1(){
		System.out.println(1);
	}
	Constructors1(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		Constructors1 con1 = new Constructors1(100);
		Constructors1 con2 = new Constructors1();
	}

}

package basicCodesForTheJavaDeveloper;

public class Constructors3 {
	Constructors3(){
		System.out.println(1);
	}
	Constructors3(int x){
		System.out.println(x);
		
		
	}
	Constructors3(int x,int y){
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		Constructors3 con = new Constructors3();
		Constructors3 con1 = new Constructors3(2);
		Constructors3 con2 = new Constructors3(3,4);
		
	}

}

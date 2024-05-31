package basicCodesForTheJavaDeveloper;

public class ConstructorChaining1 {
	
	ConstructorChaining1(int x , int y){
		System.out.println(x);
		System.out.println(y);
	}
	
	ConstructorChaining1(int x){
		this(1,2);
	}
	
	ConstructorChaining1(){
		this(10);
	}
	
	public static void main(String[] args) {
		ConstructorChaining1 c1 = new ConstructorChaining1();
	}

}

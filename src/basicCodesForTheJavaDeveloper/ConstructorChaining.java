package basicCodesForTheJavaDeveloper;

public class ConstructorChaining {
	
	ConstructorChaining(int x){
		System.out.println(100);
	}
	
	ConstructorChaining(){
		ConstructorChaining c2 = new ConstructorChaining(100);
	}
	
	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining();
	}

}

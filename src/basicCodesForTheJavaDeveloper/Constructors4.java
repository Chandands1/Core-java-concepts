package basicCodesForTheJavaDeveloper;

public class Constructors4 {
	Constructors4(int i){
		System.out.println(i);
		
	}
	Constructors4(String str){
		System.out.println(str);
	}
	Constructors4(char c){
		System.out.println(c);
	}
	Constructors4(float f){
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Constructors4 con1 = new Constructors4(10);
		Constructors4 con2 = new Constructors4("chandan");
		Constructors4 con3 = new Constructors4('a');
		Constructors4 con4 = new Constructors4(10.5f);
	}

}

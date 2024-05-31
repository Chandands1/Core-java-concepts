package basicCodesForTheJavaDeveloper;

public class ThisKeyword3 {
	ThisKeyword3(){
		System.out.println(100);
	}
	
	ThisKeyword3(int i){
		this();
	}
	public static void main(String[] args) {
		ThisKeyword3 c1 = new ThisKeyword3(100);
	}

}

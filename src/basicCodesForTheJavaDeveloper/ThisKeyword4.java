package basicCodesForTheJavaDeveloper;

public class ThisKeyword4 {
	ThisKeyword4(int i){
		System.out.println(i);
	}
	
	ThisKeyword4(){
		this(100);
	}
	public static void main(String[] args) {
		ThisKeyword4 t1 = new ThisKeyword4();
	}
}

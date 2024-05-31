package basicCodesForTheJavaDeveloper;

public class ThisKeyword5 {
	ThisKeyword5(int i){
		System.out.println(i);
	}
	ThisKeyword5(){
		this(100);
		System.out.println(1);
	}
	public static void main(String[] args) {
		
		ThisKeyword5 a1 = new ThisKeyword5();
	}

}

package array;

public class Ex02 {

	public static void main(String[] args) {
		// 향상된 for 문
		
		int[] arr = {100,200,300};
		double [] dou = { 1.11, 2.22 };
		String [] str = {"aaa", "bbb", "ccc"};

		//기존 작성방식과 다르게
		for ( int a : arr) {
			System.out.println(a);
		}
		for (double a : dou) { //여러개의 값이 순차적으로 저장된다
			System.out.println(a);
		}
		for (String a : str ) {
			System.out.println(a);
		}
		
		
	}
}

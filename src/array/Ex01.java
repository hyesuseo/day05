package array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//배열을 만드는 첫 번째 방식
		
//		int [] arr = new int[5];
//		
//		//arr =[5]개의 공간이 만들어진다.
//		
//		arr[3] = 4000;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		System.out.println("-------------");
//		
//		//배열을 만드는 두번째 방식
//		double n =1.111;
//		double dos [] = new double [] {n,2.22, 3.33, 4.44, 5.5}; 
//		//위와 같이 중괄호를 사용해서 값을 지정하면 해당하는 값으로 초기화가 된다.
//		
//		for (int i=0; i<dos.length ; i++) { 
//			//i<3은 하드코딩 : 배열의 개수를 직접입력: 에러 발생가능성 있음
//			//dos.length를 써주면 훨씬 효율적이다
//			System.out.println(i+1+" : "+ dos[i]);
//		}
//		System.out.println("length : " + dos.length);
		
		System.out.println("-------------");
		String str [] = new String [3]; //null로 초기화가 이루어진다
		 System.out.println("str[0] : " + str[0]);
		 System.out.println("str.length : "+ str.length);
		
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<str.length; i++) {
			System.out.println(i+"번째 입력: ");
			str[i] = sc.next();
		}
		
		System.out.println("출력");
		for(int i= 0; i<str.length; i++) {
			System.out.println(i + "."+str[i]);
		}
		
	}

}

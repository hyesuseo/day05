package array;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// 배열만들기
		
		//자료형 [] 이름 = new 자료형 [] {}개수
		
		String [] name = new String [5];
		Scanner sc=new Scanner (System.in);
		for (int i = 0; i<name.length; i++) {
			System.out.print("이름 입력>>>");
			name [i] = sc.next();
			
		} 
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		

	}

}

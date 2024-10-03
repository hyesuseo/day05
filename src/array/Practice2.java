package array;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		
		i = sc.nextInt();
		int array[] = new int [i];
		System.out.println("array개수: "+i);
		
		for(i=0; i<array.length; i++) {
		array [i] = sc.nextInt();
		System.out.println("입력된 값"+ array[i]);
		}
		System.out.println("입력범위 초과");
	}

}

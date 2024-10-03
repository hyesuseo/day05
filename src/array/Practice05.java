package array;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n, chan;
		
		
		n=sc.nextInt();
		int arry[] = new int [n];
		
		for (int i =0 ; i<arry.length; i++) {
			arry[i] = sc.nextInt();
		}
		int max =arry[0];
		int min =arry[0];
		
		for (int i =1; i<arry.length; i++) {
			if (arry[i] < min) {
				min = arry[i];
			}
		} System.out.print(min+" ");
		
		for (int i=1 ; i<arry.length; i++) {
			if (arry[i] > max ) { //큰 수 찾기
				max = arry[i];
			} 
		} System.out.println(max);
		
		
		
		
		
	}

}

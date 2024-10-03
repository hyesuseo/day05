package array;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		int arry [] = new int [9];
		int sear=0;
		Scanner sc = new Scanner (System.in);
		
		
		for (int i = 0; i<arry.length; i++) {
			arry[i]=sc.nextInt();
		}
		int max = arry[0];
		for (int i = 1; i<arry.length; i++) {
			if(max<arry[i]) {
				max = arry[i];
			}
		}
		System.out.println(max);
		for (int i =0; i<arry.length; i++)
			if(max == arry[i]) {
				sear=i+1;
			}System.out.println(sear);
		}	

}

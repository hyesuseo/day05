package array;

import java.util.Scanner;

public class Practice04 {
	public static void main (String args[] ) {
		
		Scanner sc=new Scanner (System.in);
		int num=0, i, max, count;
		
		num=sc.nextInt(); 
		max=sc.nextInt(); 
		int arry[] = new int [num];
		for(i=0 ; i<arry.length; i++) {
			arry[i]=sc.nextInt();
		}
		
		for(i=0; i<arry.length; i++) {
		 if(max>arry[i]) {
			 System.out.print(arry[i]+" ");
		 }
		}
		
	}
}

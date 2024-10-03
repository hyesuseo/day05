package array;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, num, count=0;
		i = sc.nextInt();
		int array[] = new int [i];
		
		for(i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		num=sc.nextInt();
		for (i=0; i<array.length; i++) {
			if(num==array[i]) {
				count++;
			} 
		}	
		System.out.println(count);
			
		}
		

	}



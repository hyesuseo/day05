package array;

import java.util.Scanner;

public class quiz03 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even =null;
		System.out.print("짝수, 홀수 입력: ");
		odd_even=sc.next();
		
//		for (int i = 0; i<arr.length; i++) {
//			
//			if(odd_even.equals("짝수") && i%2==0) {
//				
//				
//			
//			}
//			else if(odd_even.equals("홀수") && i%2!=0) {
//				System.out.println("index가 홀수: ["+i+"]: "+arr[i]);
//			}
			
//		for (int i : arr) {
//			if(odd_even.equals("짝수") && i%2==0) {
//				
//				System.out.println("index가 짝수: ["+i+"]: "+ arr[i]);
//			}
//			
//			else if(odd_even.equals("홀수") && i%2!=0) {
//				System.out.println("index가 홀수: ["+i+"]: "+arr[i]);
//			}
//		}
		
		for (int k =odd_even.equals("짝")?0:1 ; k<arr.length; k++) {
			System.out.println("index가 짝수: ["+k+"]: "+ arr[k]);
		}
		
		
	}

}

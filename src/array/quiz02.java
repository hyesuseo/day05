package array;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even =null;
		System.out.print("짝수, 홀수 입력: ");
		odd_even=sc.next();
		
		for (int i = 0; i<arr.length; i++) {
			
			if(odd_even.equals("짝수") && arr[i]%2==0) {
				
				System.out.println("짝수: "+ arr[i]);
			
			}
			else if(odd_even.equals("홀수") && arr[i]%2!=0) {
				System.out.println("홀수: "+arr[i]);
			}
			
		}

	}

}

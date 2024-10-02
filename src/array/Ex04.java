package array;

public class Ex04 {

	public static void main(String[] args) {
		
		int[][] arr = new int [][] 
		{
			{ 1 , 2 , 3, 4},
			{10 , 20 , 30,40},
			{100,200,300,400}
		};
		
	
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		
		for (int i =0; i<arr.length; i++) { //i<arr.length
			for(int j= 0; j<4 ; j++) { // j< arr[i].length
				System.out.print(i+", "+j+" => ");
				System.out.println(arr[i][j]);
			}
		}
		
		//2차원 배열에서 arr.length쓰는 법
		System.out.println("arr.length : "+ arr.length);
		//기본 세로줄에 대한 길이를 알려줌
		System.out.println("arr[].length : "+arr[0].length);
		//0번째 세로줄에 대한 길이를 알려줌
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

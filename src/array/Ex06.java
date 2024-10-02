package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		String[] n = new String[3];
		int count=0;
		Scanner scan=new Scanner(System.in);
		while(true) {
			while (count<n.length) {
				//n= [111, bbb, ccc]
				System.out.println(count + "." + n[count]);
			
				if (n[count] ==null) {
				System.out.println(count+".번째 입력");
				n[count]= scan.next();
				break; //break로 강제로 빠져나오면 length보다 작다
				//length보다 작을때 빠져나왔으면 저장이 되었다는 소리
				//while의 조건에 의해 빠져나온 것은 입력을 받지 못했다는 소리
				//인데 뭔말인지 모르겠다 하하 ㅎㅎㅎㅎ
				}
				count ++;
			}
		System.out.println("-----------------------");
		System.out.println("cnt : " + count);
		System.out.println("n.length : " + n.length);
		System.out.println("-----------------------");
		}
	}
	

}

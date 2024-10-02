package array;
import java.util.Scanner;

public class quiz04_modify {
	

	

			public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			//비교는 5번 해야함!
			String[] id = new String[5];
			String[] pw = new String[5];
			int choice,i =0, b=0, c=0;
			boolean run = true;
			String idin, pwin;
			//idin과 pwin은 각각 입력받을 id와 pw
			
			while (run) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원보기");
			System.out.println("4. 종료");
			System.out.print(">>> : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1 : //로그인 시 - 확인하는 것만 만들면 됨 아직 입력받지 않음
				System.out.print("id입력: ");
				idin=sc.next();
				System.out.print("pw입력: ");
				pwin=sc.next();
				for (i = 0; i<id.length; i++) {
				if(idin.equals(id[i])) {
				 if (pwin.equals(pw[i])) {
					 System.out.println("인증이 성공하였습니다"); 
				 } else {
					 System.out.println("비밀번호 틀림");
				 }
				}break;
				}
				 if (i == id.length) {// 이 조건이 참(true)이라면, 
			//변수 i가 배열 id의 마지막 인덱스 다음에 위치한다는 의미입니다.
			//즉, i가 id.length이면 배열의 범위를 넘어선 것입니다.
					System.out.println("존재하지 않는 아이디입니다.");
					}
				break; //case 1 종료
					
			case 2 : // 입력받아서 각 []에 저장
				System.out.print("신규 id 입력: ");
				idin = sc.next();
				System.out.print("신규 pw 입력: ");
				pwin = sc.next(); //입력을 먼저 받는다.
				
				String result = "시작"; 
				//result값이 변경되면 회원가입 성공
				//초기값에서 변화가 없다면 회원가입 실패
				
				//입력받은 값과 배열0번째, 1번째 값이 null인지 아닌지 값을 비교를 해주어야 한다
				for(i=0; i<id.length ; i++) {
				//	System.out.println(id[i]);
					if (id[i] ==null) { //null일때 회원가입
						result = "가입";
						id[i] =idin;
						pw[i] =pwin ;
						System.out.println("가입완료");
						break; //그 위치에 저장시키고 더 이상 저장하지 않고 반복!
					}
				}
				if(result.equals("시작")) {
					System.out.println("저장공간이 없습니다");
				}
				
				break; //case 2 종료
			
			case 3: 
				System.out.println("회원 id\t 회원 pw\t");
				System.out.println("==================");
				if (id[c]==null) {
					System.out.println("등록된 회원이 없습니다");
				} else {
					for (b = 0 ; b<id.length && id[b]!=null; b++) {
					System.out.println(id[b]+"\t"+pw[b]+"\t");
				}
				}
				System.out.println("==================");
				
				break; //case 3 종료
				
			case 4: //시스템 종료
				System.out.println("시스템 종료합니다");
				run= false;
				break; //case 4종료
				
			
			
			}// switch문 종료
		}// while에 대한 괄호

		

	}

}

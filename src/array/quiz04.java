package array;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//비교는 5번 해야함!
		String[] id = new String[2];
		String[] pw = new String[2];
		int choice, i =0, b=0, c=0, result = 0;
		boolean run = true, bool;
		String idin, pwin, modifid, modifpw, delid;
		//idin과 pwin은 각각 입력받을 id와 pw
		
		while (run) {
		System.out.println("--------------------");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 모든 회원보기");
		System.out.println("4. 회원정보 수정");
		System.out.println("5. 회원정보 삭제");
		System.out.println("6. 종료");
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
				 System.out.println("인증 성공!");
				 
					} else {
				 System.out.println("비밀번호 틀림");
					} result =1;
				}}
			if(result ==0) {
			System.out.println("존재하지 않는 아이디입니다");
			break;
			}
			
			break; //case 1 종료
				
		case 2 : // 입력받아서 각 []에 저장
			bool= true; // 여기에서 초기화를 다시 시켜야 bool이 true가 됨!
			// if문을 들어갔다오면 bool은 false값이 입력되므로!
				System.out.print("신규 id 입력: ");
				idin = sc.next(); 
				System.out.print("신규 pw 입력: ");
				pwin = sc.next();
				
				for(i=0; i<id.length; i++) {
				
					if( idin.equals(id[i]) ) {
			               System.out.println("동일한 id 있음");
			               bool = false;
			               break;
			         }

					if (id[i]==null) {
					
					id[i]=idin;
					pw[i]=pwin;
					System.out.println("가입 완료");
					bool=false; break;
					
					}	
				}
				if (bool==true) {
					System.out.println("저장공간 없음");
				
				}
			
			break; //case 2 종료
		
		case 3: 
			System.out.println("회원id\t 회원pw\t");
			System.out.println("====================");
						
			for(int j=0 ; j < id.length ; j++) {
	            if( id[j] != null) {
	               System.out.println( id[j] +"\t" +pw[j]+"\t");
	         } else if(id[j] ==null) {
	        	 System.out.println("회원정보가 없습니다."); break;
	         }
			}
			System.out.println("====================");
			
			break; //case 3 종료
		
		case 4: //회원정보 수정
			System.out.println("---회원정보 수정합니다---");
			
			System.out.print("수정하려는 아이디 입력: ");
			modifid = sc.next();
			//아이디가 일치하는게 있으면 그 배열번호 찾음
			//배열번호 찾아서 같은 배열의 비밀번호와 비교
				//비밀번호가 같으면 수정하는 비밀번호 입력받아 새로 저장
			//아이디 일치하는게 없으면 해당 "id는 존재하지 않습니다"
		//	System.out.println(i); 다른 곳에서 i가 ++되어서 1이 되었으므로
			//i를 다시 0으로 초기화 시켜주고 시작해야함!
			for(i=0 ;i<id.length;i++) {
				if(modifid.equals(id[i])) {
				System.out.print("수정하려는 비밀번호 입력: ");
				modifpw = sc.next();
				pw[i]=modifpw;
				System.out.println("수정된 비밀번호: " + pw[i]);
				System.out.println("비밀번호가 수정되었습니다.");
				break;
				}else if (!modifid.equals(id[i])) {
					System.out.println("해당 아이디는 존재하지 않습니다");
					break;
				}
				}
			
			break; //case 4에 대한 break;
			
		case 5: //회원정보 삭제
			System.out.println("---회원정보 삭제합니다---");
			System.out.print("삭제하려는 아이디 입력: ");
			delid = sc.next();
			for(i=0 ;i<id.length;i++) {
				if(delid.equals(id[i])) {
				
				id[i]=null;
				System.out.println("아이디가 삭제되었습니다.");
				break;
				}else if (!delid.equals(id[i])) {
					System.out.println("해당 아이디는 존재하지 않습니다");
					break;
				}
				}
			break; 
			
			
			
			
		case 6: //시스템 종료
			System.out.println("시스템 종료합니다");
			run= false;
			break; //case 4종료
			
		
		
		}// switch문 종료
	}// while에 대한 괄호

	}
}



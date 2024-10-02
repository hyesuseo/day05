package array;

import java.util.Scanner;

public class example {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   String [] id = new String[2];
   String [] pwd = new String[2];
   
   String inputId, inputPwd;
   int num;
   boolean bool = true;
   while( bool ) {
      System.out.println("1.로그인");
      System.out.println("2.회원가입");
      System.out.println("3.모든 목록");
      System.out.println("4.종료");
      System.out.print(">>> : ");
      num = input.nextInt();
      switch ( num ) {
      case 1:
         System.out.println("로그인 기능");
         System.out.println("로그인 id 입력");
         inputId = input.next();
         System.out.println("로그인 pwd 입력");
         inputPwd = input.next();
         int ret = 0;
         for(int j=0 ; j<id.length ;j++) {
            if(inputId.equals( id[j]) ) {
               ret = 1;
               System.out.println("동일한 id 있을 경우");
               if( inputPwd.equals(pwd[j]) ) {
                  System.out.println("인증 통과");
               }else {
                  System.out.println("비밀번호 틀림!!");
               }
            }
         }
         if(ret == 0 )
            System.out.println("존재하지 않는 id 입니다");
         break;
      case 2:
         boolean boo = true;
         
         System.out.println("가입 기능");
         
         System.out.println("저장할 id 입력");
         inputId = input.next();
         System.out.println("저장할 pwd 입력");
         inputPwd = input.next();

         
         int i;
         for( i=0 ; i < id.length ; i++) {
            //inputId = 444
            //id = [ 111 , 222 , null, null, null ]
            System.out.println( id[i] );
            if( inputId.equals(id[i]) ) {
               System.out.println("동일한 id 있음");
               boo = false;
               break;
            }
            if( id[i] == null ) {
               boo = false;
               id[i] = inputId;
               pwd[i] = inputPwd;
               System.out.println("가입 완료!!!");
               break;
            }
         }
         if( boo ) {// boo == true
            System.out.println("저장공간 없음!!!!");
         }
         break;
      case 3:
         System.out.println("목록 기능");
         System.out.println("==============");
         System.out.println("id\tpwd");
         System.out.println("==============");
         for(int j=0 ; j < id.length ; j++) {
            if( id[j] != null)
               System.out.println( id[j] + "\t" + pwd[j] );
         }
         break;
      case 4:
         System.out.println("종료");
         bool = false;
      }
   }
}
}
















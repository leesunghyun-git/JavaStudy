/*
 * 	1. 조건문
 * 	   형식 )
 *    			if(조건문)
 *    			{ -----------> true / false 가 결과값인 연산자만 사용
 *    						   --------------
 *    							부정연산자(!)
 *    							비교연산자(==,!=,<,>,<=,>=)
 *    							논리연산자(&& , ||)
 *    						조건이 true 일때만 실행 => false면 건너뛴다
 *    			}
 *    			=> 사용 : 상세보기 , 버튼클릭 , 메뉴 클릭
 *    					 로그인처리 , 아이디찾기, 비밀번호찾기
 *    					 아이디 중복체크, 검색 , 유효성 검사
 *    			선택 조건문 : true / false 를 나눠서 작업
 * 				
 * 				if(조건문)   
 * 				{
 * 					조건이 true => 수행
 * 					아이디가 입력된 경우
 * 				}
 * 				else
 * 				{
 * 					조건이 false => 수행
 * 					아이디가 입력이 안된 경우	
 * 				}
 * 				----------------------------
 * 				=> 로그인 처리 : 로그아웃 창
 * 				=> 로그인 처리가 안된 상태 : 로그인 창
 * 				=> 파일 2개 (로그인, 로그아웃)
 * 				   session
 * 				---------------------------------
 * 				=> 검색
 * 				   ---- 데이터가 있는 경우 : if
 * 				   ---- 검색이 안된 경우 : else
 * 
 * 				=> 다중조건문 (사용빈도가 낮다:웹 개발)
 * 					=> 선택문 
 * 					=> DECODE / CASE
 * 					   ------   -----
 * 				형식)
 * 					if(조건문)
 * 					{
 * 						조건 true => 실행문장 => 종료
 * 						조건 false
 * 					}		 |
 * 					else if(조건문)
 * 					{
 * 						조건 true => 실행문장 => 종료
 * 						조건 false
 * 					}		 |
 * 					....
 * 					else
 * 					{
 * 						해당 조건이 없는 경우 => 수행문장
 * 						=> 생략이 가능
 * 					}
 * 					
 * 					--------------------
 * 					+,-,*,/ => 아니면 => 처리
 * 					-------
 * 					=> switch
 * 					=> 다중조건문 vs switch
 * 					  -------------------
 * 					   범위지정 		=> 값 1개만 지정
 * 									   ----------- 키보드
 * 					=> switch(문자,문자열,정수)
 * 					   case 'A'
 * 					   case 1
 * 					   case "LOGIN"
 * 
 * 						switch(문자)
 * 						{
 * 						  	case 'A':
 * 								처리문장
 * 								break;
 * 							case 'B':
 * 								처리문장
 * 								break;
 * 							case 'C':
 * 							case 'D':
 * 								처리문장
 * 								break;
 * 							default:
 * 								case에 없는 값일때 처리문장
 * 						}
 *	
 *
 *						=> break가 없는 처리
 *						switch(문자)
 *						{
 *							case'A' -> {
 *							처리문장
 *							}
 *							case'B' -> {
 *							처리문장
 *							}
 *							case 'C','D' -> {
 *							처리문장
 *							}
 *						}
 *					---------------------------------------
 *						윈도우 / 네트워크 = 자주 사용
 *			
 *					------------------------------------------
 *					외부 : 화면 출력 => 목록 출력
 *						  반복문 => for / while 
 *								  -------------
 *					*** for : 일차 , for 이차 => 알고리즘
 *					*** while : 데이터베이스
 *					do~while : 사용빈도가 거의 없다.
 * 
 * 					-----------------------------------------------------
 * 					
 * 					2차 for
 * 					for (int i=1;i<=3;i++)
 * 					{		
 * 						for(int j=1;j=3;j++)
 * 						{
 * 							실행문장
 * 						}
 * 					}
 * 
 * 					i=1 > i<=3 => true
 * 						  j=1 실행문장 j++
 * 						  j=2 실행문장 j++
 * 						  j=3 실행문장 j++
 * 						  j=4 j<=3 => false => i++
 * 					i=4 => 프로그램 종료
 * 					
 * 					=> for응용
 * 
 * 
 */
import java.util.*;
public class 제어문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("일 입력:");
		int day=scan.nextInt();
		
		Calendar cal1=Calendar.getInstance();
		// 메모리 저장
		// 날짜 지정
		cal1.set(Calendar.YEAR, year);
		cal1.set(Calendar.MONTH, month-1); // month => 0번부터
		cal1.set(Calendar.DATE, 1);
		
		int w=cal1.get(Calendar.DAY_OF_WEEK);
		String s="";
		switch(w)
		{
			case 1:
				s="월"; break;
			case 2:
				s="화"; break;
			case 3:
				s="수"; break;
			case 4:
				s="목"; break;
			case 5:
				s="금"; break;
			case 6:
				s="토"; break;
			case 7:
				s="일"; break;
		}
		
		System.out.printf("\t(●'◡'●) %d년 %02d월 %02d일 %s요일 (●'◡'●)\n\n",year,month,day,s);
		
		System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토");
		System.out.println();
		

		
		
		
		int week=cal1.get(Calendar.DAY_OF_WEEK);
		//요일 (1번시작)
		week=week-1;
		int lastday=cal1.getActualMaximum(Calendar.DATE);
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			if(i==day)
				System.err.printf("%02d\t",i);
			else
				System.out.printf("%02d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}

}

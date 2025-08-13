/*
 * 		1.	 객체지향프로그램
 * 			 클래스
 * 			 1) 클래스 구성요소
 * 				-----------
 * 				 *** 변수
 * 				  = 인스턴스변수 : 메모리저장 할때 따로 저장
 * 							    저장시기 => new 
 * 								=> heap => 프로그래머가 관리
 * 				  = 정적변수 : static => 메모리 공간을 한개 사용
 * 							 => 공유하는 변수
 * 								=> MethodArea
 * 				  = 지역변수	: 메소드가 종료되면 사라지는 변수
 * 							  => Stack => {} 메모리 = 자체 관리
 * 				-----------
 * 				 *** 메소드
 * 					목적
 * 					= 반복되는 기능 제거
 * 						예)
 * 							데이터베이스 , 네트워크(서버 = 클라이언트)
 * 							--------   ----------------------
 * 							모든 기능			  보내기 / 받기
 * 							오라클 연결
 * 							기능 처리
 * 							오라클 닫기 => 기능 10개 
 * 							=> 유지보수 : 기능
 * 							=> 프로그램의 80%
 * 							=================================
 * 
 * 
 * 					=	소스가 간결해 진다
 * 					=	재사용 (다른 클래스와 연결)
 * 					--------------------------------
 * 					 오버로딩 / 오버라이딩 => 메소드
 * 					= 단락을 나누는 과정
 * 						=> 코드 관리가 쉽게 (기능별 분리)
 * 						=> 가독성
 * 					***
 * 					 1. 가독성
 * 					 2. 최적화
 * 						scp
 * 						async
 * 					 3. 수정 / 추가
 * 					 4. 공통으로 사용되는 기능 => 공통모듈
 * 					*** 					
 * 
 * 				-----------
 * 				    생성자 : 변수에 대한 초기화
 * 							=> 프로그램에서 가장 먼저 호출	
 * 							=> 시작과 동시에 구현
 * 							=> 서버 / 데이터베이스 / 화면 UI
 * 							=> 자동로그인
 * 							=> 메소드의 일종
 * 							=> . => new 생성자()
 * 					*** 함수 / 메소드
 * 						=> 기능 처리
 * 						=> 독립적 : 함수
 * 						=> 메소드 => 클래스영역 => 클래스 종속
 * 								   자바 / C#
 * 					*** 라이브러리 / 프레임워크
 * 						 | 완제품	   | 레고
 *      		----------------------------
 *      		1. 변수 / 2. 메소드
 *      	2) 메소드
 *			   형식)
 *				
 *				[접근지정어][제어어] 리턴형 메소드명(매개변수 목록)
 *				{
 *					--- 명령문
 *					--- 
 *					---
 *					return 값;
 *				} 
 *
 *				= 접근지정어 (public, private , protected, default )
 *				  default:같은 폴더안에서만 접근이 가능
 *				= 제어어 (static , final , abstract)
 *				  static : => 컴파일시에 자동 저장
 *		
 *			class A
 *			{
 *				void aaa(){} => 저장이 안됨 => 95%
 *					A a=new A()
 *				Static void bbb(){} => 저장 => 5%
 *			}
 *				
 *			= 리턴형
 *				=> 처리 결과값
 *				=> 기본형 (int , long , double, char , String )
 *				=> 데이터가 여러개 : 배열 / 클래스
 *								--------------
 *								 한개의 이름
 *				=> 자바는 리턴형을 반드시 개만 사용이 가능
 *				=> 메소드 자체 처리
 *					출력 / 추가 / 삭제 / 수정 => void
 *				int 메소드명()
 *				{
 *					return 값; => int , char , short , byte
 *						  --- 같거나 작은 값
 *				}
 *		
 *				*** 변수명이 다른 경우
 *				int a=10;
 *				System.out.println(b); => 에러 변수미존재
 *				*** 리턴형 값 다른 경우
 *				--------------------------------------------
 *			= 메소드명
 *				=> 식별자
 *				   알파벳사용 , 한글 => 알파벳 권장
 *									--------------
 *				   자바() => %EDED%WW%DED => ??()
 *				   => 대소문자 구분
 *				   => 약속 : 소문자로 시작
 *				   숫자 사용 (앞에 사용 금지)
 *				   키워드 사용 금지
 *				   공백없이 사용
 *					=> 가급적 의미 부여
 *					----------------- 글자수 제한은 없다
 *					= 데이터 추가
 *					  aaa1() aaa2() aaa3()
 *					  insert() update() delete()
 *			= 매개변수 : 사용자 요청 데이터
 *				=> 가공 => 결과값 도출
 *				=> 없는 경우 / 여러개 / 한개 ...
 *				=> 검색 요청
 *					=> 검색어 1개
 *				=> 로그인
 *					=> id / password
 *				=> 회원가입
 *					=> id.pwd.name.sex.birthday ....
 *					  ----------------------------------
 *						class
 *				=> 정렬
 *					=> 배열
 *				----------------------------------------- 3개 이상이면 배열/클래스
 *			=> 동작
 *				호출 => 매개변수 => 처리 => 결과값 돌려준다
 *
 *			=> 기본 : 재사용 / 다른 클래스 통신
 *						=> 반드시 한개의 기능만 수행
 *						=> 최대한 세부적으로 분리
 *			=> static void aaa(int a){}
 *								int a=10
 *				: 같은 클래스에서 호출
 *				  aaa(10)
 *					  --- 실제 값 주입
 *				: 다른 클래스에서 호출
 *				  클래스명.aaa(20)
 *			=> static int aaa(int a,int b){}
 *				=> int a=aaa(10,20)
 *			=> 메소드를 호출할 경우
 *				=> 처음부터 끝까지 수행 => 호출한 위치 원상 복귀
 *			=> 메소드 종료
 *				----------- return이 있는 곳에서 종료
 *				
 *			void aaa(int a)
 *			{
 *				if(a==10)
 *					return;
 *				else
 *					return;
 *			}
 *			
 *			aaa=10 ==> if 문을 수행하고 종료
 *			
 *			void aaa()
 *			{
 *				---
 *				---
 *				---
 *			}
 *				// return 추가 => 자동 추가 => 컴파일러가 처리
 *			
 *			int aaa(int a)  => aaa(1)
 *			{
 *				if(a==1)
 *					return 10
 *				else if(a==2)
 *					return 20
 *				else
 *					return 30
 *			
 *				return res
 *			}
 *			
 *			==> 정답이 없다
 *
 *			void aaa(int a)
 *			{
 *				System.out.println("진입");
 *				System.out.println("요청값:"+a);
 *				System.out.println("종료");
 *			}
 *			
 *			aaa(1) => 진입 => 요청값:1 => 종료 
 *			aaa(2) => 진입 => 요청값:2 => 종료
 *			aaa(3) => 진입 => 요청값:3 => 종료
 *			
 *			void bbb()
 *			{
 *				int a=10;
 *				System.out.println(a)
 *				a++;
 *			}
 *
 *			bbb() => 10
 *			bbb() => 10
 *			bbb() => 10
 *				
 *
 * 
 */

// 숫자야구게임
/*	
 * 	
 * 	난수 발생 : 임의의 수 3개 추출
 * 	-------------------------
 * 	사용자 입력
 * 	비교
 * 	힌트
 * 	종료여부
 * 	--------------- 메소드 5개
 * 	=> 전체 조립
 * 	--------------- 1개 process()
 */


// 절차적 언어 ==> 구조적 언어 ==> 객체지향 ==> 횡단지향

/*
 * 
 * 			절차적언어 => 재사용이 불가능
 * 					   소스 수정이 어렵다
 * 			=> 개선 사항
 * 			   재사용이 가능 / 게임 다시 수행
 * 			   소스를 관련내용을 모아서 관리 ==> 수정
 * 			   구조적인 프로그램 (메소드)
 * 			   ------------------------------
 * 				매개변수 / 리턴형 너무 많다
 * 			   ------------------------------
 * 				  | 전역변수 도입
 * 
 * 
 */
import java.util.Scanner;
public class 메소드_1 {
	
	private int round=10;
	private int level=3;
	private Scanner scan=new Scanner(System.in);
	public void setRound() { //라운드수 입력 메소드
		
		System.out.print("플레이할 라운드 입력:");
		int round=scan.nextInt();
		this.round=round;
	}
	public void setLevel() //레벨 입력 메소드
	{
		System.out.print("난이도 설정(3~9):");
		int level=scan.nextInt();
		this.level=level;
	}
	public boolean numcheck(int[] numarray) //숫자 중복 체크 메소드
	{	
		boolean check=true;
		boolean[] numck=new boolean[10]; // 0~9까지 중복체크 배열
		for(int i=0;i<numarray.length;i++)
		{
			if(numck[numarray[i]]==true)
			{
				check=false;
				break;
			}	
			else
				numck[numarray[i]]=true;
		}	
		return check;
	}
	public int[] rand() { //난수 생성 메소드
		int[] com = new int[level];
		boolean check=true;
		while(true) {
			for(int i=0;i<com.length;i++)
			{
				com[i]=(int)(Math.random()*9)+1;
			}
			if(numcheck(com)==false)
				continue;
			break;
		}
		return com;
	}
	public int[] userInput() { //
		boolean check=true;
		int[] userInput;
		while(true) {
			userInput=new int[level];
			System.out.print(level+"자리 숫자를 입력:");
			String user=scan.next();
			if (user.length()!=level)
			{
				System.out.println(level+"자리 숫자를 입력해야 합니다.");
				
				continue;
			} 
			for(int i=0;i<userInput.length;i++)
			{
				userInput[i]=user.charAt(i)-'0';	
			}
			if(numcheck(userInput)==false)
			{
				System.out.println("중복된 숫자입니다.");
				continue;
			}
		break;
		}
		return userInput;
	}
	public int stCheck(int[] user,int com[])
	{
		int strike=0;
		for (int i=0;i<user.length;i++)
		{
			if(user[i]==com[i])
				strike++;
		}
		return strike;
	}
	public int ballCheck(int[] user,int com[])
	{
		int ball=0;
		for (int i=0;i<user.length;i++)
		{
			for (int j=0;j<com.length;j++)
			{
				if(user[i]==com[j] && i!=j)
				{
					ball++;
				}
			}
		}
		return ball;
	}
	public void newcoin() {
		System.out.print("새 게임을 시작하시겠습니까? (Y or N)");
		char newcoin = scan.next().charAt(0);
		if (newcoin=='Y' || newcoin=='y')
		{
			System.out.println("New game start");
			process();
		}
		else
			scan.close();
	}
	public void process() {
		setLevel(); // 난이도 설정
		setRound(); // 플레이할 라운드수 설정
		int roundCount=0;
		int[] com=rand(); // 컴퓨터가 level에 맞는 변수 생성 int배열에 저장
		while(true)
		{	
			roundCount++;
			System.out.println(roundCount+"라운드");
			int strike=0;
			int ball=0;
			int[] user=userInput(); // 유저가 입력한 배열 저장
			strike=stCheck(user,com);
			ball=ballCheck(user,com);
			
			if(strike==level)
			{
				System.out.println(strike+"스트라이크 게임종료!");
				System.out.println("플레이한 라운드 : "+roundCount);
				break;
			}
			else if(roundCount==round)
			{
				System.out.println(level+"라운드 끝 게임종료");
				System.out.println("패배!");
				break;
			}
			else 
			{
				System.out.printf("%d 스트라이크 %d 볼\n",strike,ball);
			}
			
		}
		newcoin();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_1 baseball = new 메소드_1();
		baseball.process();
		
	}

}

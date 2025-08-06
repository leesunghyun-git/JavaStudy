
public class 메소드_1_재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_1 a=new 메소드_1();
		int year=a.input("년도 입력");
		int month=a.input("월 입력:");
		int day=a.input("일 입력:");
		
		System.out.println(year+"년도"+month+"월"+day+"일");
		a.process();
		
	}

}

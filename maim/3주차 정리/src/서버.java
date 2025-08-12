import java.lang.reflect.Method;
import java.util.Scanner;
class User{
	@RequestMapping("login.jsp")
	String login()
	{
		System.out.println("login처리");
		return "login.jsp";
	}
	@RequestMapping("member.jsp")
	String member()
	{
		System.out.println("회원 가입 처라");
		return "member.jsp";
	}
	@RequestMapping("borad.jsp")
	String board()
	{
		System.out.println("게시판 요청 => 처리");
		return "list.jsp";
	}

}
public class 서버 {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.print("URL 주소 입력:");
		String url=scan.nextLine();
		// https://localhost:8080/member/login.jsp?id=aaa
		String cmd=url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("?"));
		System.out.println(cmd);
		
		Class clsName=Class.forName("User");
		Object obj=clsName.getDeclaredConstructor().newInstance();
		Method[] methods=clsName.getDeclaredMethods();
		
		for(Method m:methods)
		{
			RequestMapping rm=m.getAnnotation(RequestMapping.class);
			if(rm.value().equals(cmd))
			{
				m.invoke(obj, null);
				break;
			}
		}
	}

}

//// 암호화 => encoding => decoding
//// 시저스암호화 => 3칸 	이동 ABC => DEF => ed4559 rsa 
//import java.util.Base64;
//import java.util.Scanner;
////https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRg7MgYIAhBFGDsyDQgDEC4YxwEY0QMYgAQyDAgEECMYJxiABBiKBTIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBBzcxNmowajSoAgCwAgE&sourceid=chrome&ie=UTF-8
//public class 메소드_5 {
//	private static String key="";
//	private static String decodekey="";
//	public 메소드_5 (String key)
//	{
//		this.key=key;
//	}
//	public static String Encode () throws Exception
//	{
//		String encodekey=Base64.getEncoder().encodeToString(key.getBytes());
//		return encodekey;
//	}
//	public static String Decode (String encodedkey) throws Exception
//	{
//		byte[] decoding=Base64.getDecoder().decode(encodedkey);
//		decodekey=new String(decoding);
//		return decodekey;
//	}
//	public void setKey(String key)
//	{
//		this.key=key;
//	}
//	public String getKey()
//	{
//		return key;
//	}
////	static String encoder(String s) throws Exception
////	{
////		return URLEncoder.encode(s,"UTF-8");
////	}
////	static String decoder(String s) throws Exception
////	{
////		return URLDecoder.decode(s,"UTF-8");
////	}
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
////		String s="자바";
////		String en=URLEncoder.encode(s,"UTF-8");
////		System.out.println(en);
////		String ko=URLDecoder.decode(s, "UTF-8");
////		System.out.println(ko);
//		Scanner scan = new Scanner(System.in);
//		String key=scan.next();
//		메소드_5 k=new 메소드_5(key);
//		String encodekey=Encode();
//		System.out.println(encodekey);
//		String decodedkey=Decode(encodekey);
//		System.out.println(decodedkey);
//		System.out.println("========setKey 사용 확인 =======");
//		k.setKey(scan.next());
//		encodekey=Encode();
//		System.out.println(encodekey);
//		decodedkey=Decode(encodekey);
//		System.out.println(decodedkey);
//		
//		
//		
//		
//	}
//
//}

import java.util.Base64;
import java.util.Scanner;

public class 메소드_5 {
    private String key; 
    private String decodedKey;

    public 메소드_5 (String key) { //생성자 메소드_5
        this.key = key;
    }

    public String encode() {
        return Base64.getEncoder().encodeToString(key.getBytes());
    }

    public String decode(String encodedKey) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedKey);
        decodedKey = new String(decodedBytes);
        return decodedKey;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("초기 key 입력: ");
        String inputKey = scan.nextLine();

        메소드_5 encoder = new 메소드_5(inputKey); //메소드_5 에 대한 객체 생성 및 메소드_5 클래스의 key에 scan 한 값 대입

        String encoded = encoder.encode();
        System.out.println("Encoded: " + encoded);

        String decoded = encoder.decode(encoded);
        System.out.println("Decoded: " + decoded);

        System.out.println("==== setKey 사용 후 확인 ====");
        System.out.print("새 key 입력: ");
        String newKey = scan.nextLine();

        encoder.setKey(newKey);
        String newEncoded = encoder.encode();
        System.out.println("Encoded: " + newEncoded);

        String newDecoded = encoder.decode(newEncoded);
        System.out.println("Decoded: " + newDecoded);

        scan.close();
    }
}

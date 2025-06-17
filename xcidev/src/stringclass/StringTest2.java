package stringclass;

public class StringTest2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 문자열 클래스를 용량을 수정할수 있게 만드는 클래스
		System.out.println(sb.length());
		System.out.println(sb.capacity() +":"+ sb.toString());
		sb.append("실수란");System.out.println(sb.capacity() + ":"+ sb.toString());
		sb.append("신을");System.out.println(sb.capacity() + ":"+ sb.toString());
		sb.append("용서하는");System.out.println(sb.capacity() + ":"+ sb.toString());
		sb.append("인간의");System.out.println(sb.capacity() + ":"+ sb.toString());
		sb.append("행위다");System.out.println(sb.capacity() + ":"+ sb.toString());
	}
}

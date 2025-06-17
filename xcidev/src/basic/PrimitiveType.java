package basic;

import java.math.BigInteger;
import java.math.BigDecimal;

public class PrimitiveType {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
		byte b2 = 10; // -128 ~ 127
		System.out.println(b2);

		char c = '뷁'; // 0~65535 까지 각 문자가 매핑
		
		int i = 2147483647; // -2^31 ~ 2^31-1 : 약 -20~20억
		//int i = 2147483648; 최댓값 초과 에러
		i = i + 1;
		System.out.println(i);
		
		short sh = 32767; // -32768 ~ 32767
		System.out.println(sh);
		
		long lo = 2147483648L; // 8바이트 정수타입, -900~900경
		System.out.println(lo);
		
		double d = 3.141592535; // 8바이트
		System.out.println(d);
		
		float f =  3.141592535f; // 4바이트
		System.out.println(f);
		
		System.out.println(2 -1.1); // 0.899999999999999
		
		BigDecimal bi = new BigDecimal("2");
		System.out.println(bi.subtract(new BigDecimal("1.1")));
	}
}

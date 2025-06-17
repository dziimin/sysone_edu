 package oop11b;

import java.io.FileInputStream;
import java.util.Properties;

public class ProductReader {
	// simple factory pattern 구조안에서 설정값을 읽기 위해 책임을 분리해낸 유틸리티 클래스
	private static Properties props = new Properties();

	static {
		try {
			props.load(new FileInputStream("src/oop11b/product.properties"));
		} catch (Exception e) // (FileNotFoundException e) {  
		// Throwable > Exception > .... FileNotFoundException => 업캐스팅 되도록 상위 클래스인 Exception으로 변경
		{
			e.printStackTrace();
		}
	}

	public static String getValue(String key) {
		return props.getProperty(key);
	}
}

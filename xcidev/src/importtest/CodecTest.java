package importtest;

// 상단 Project > Properties > Java Build Path > Libraries > classpath > add External JARs..
import org.apache.commons.codec.digest.DigestUtils;

// 나만의 라이브러리
// Package Explorer > 프로젝트 우클릭 > Build Path > Add Libraries > User Library >
public class CodecTest {
	public static void main(String[] args) {
		String password = "abcd1234";
		
		System.out.println(DigestUtils.sha512Hex(password)); // 암호화
	}
}

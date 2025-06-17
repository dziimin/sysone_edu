package oop11b;

public class MarshallSpeaker implements Speaker{

	public MarshallSpeaker() {
		System.out.println("MarshallSpeaker : 제품이 생성됨");
	}
	
	@Override
	public void soundUp() {
		System.out.println("MarshallSpeaker : 소리를 키웁니다.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("MarshallSpeaker : 소리를 줄입니다.");
		
	}

}

package oop11b;

public class TVUser {
	public static void main(String[] args) {
		/* 1.
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		=> 결합도가 높은 코드 (=bad)
		 */
		
		/* 2.
		TV tv = new LgTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		=> properties 파일을 통해 외부에서도 변경 가능 하게끔 변경
		*/
		
		TV tv = TVFactory.getTV();
		tv.setSpeaker(SpeakerFactory.getSpeaker());
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}

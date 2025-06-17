package oop11;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop11/product.properties"));
		
		String tvName = prop.getProperty("tv"); // key 값
		Class tvClass = Class.forName(tvName); // 클래스가 존재하는지 확인		
		
		String speakerName = prop.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
		
		//TV tv = new SamsungTV();
		TV tv = (TV)tvClass.getConstructor().newInstance(); // Object로 upcasting 후 TV downcasting
		//tv.setSpeaker(new MarshallSpeaker()); //=> 매번 x => default 메서드 생성 (TV.java)
		tv.setSpeaker((Speaker)speakerClass.getConstructor().newInstance());
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.powerOff();
	}
}

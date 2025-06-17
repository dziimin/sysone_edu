package oop11;

public interface TV {
	
	public default void setSpeaker(Speaker speaker) {} //설계가 바뀌었을때 SamsungTV 에 추가하듯이 모든곳에 추가하지 않고 여기에 디폴트 지정
	
	// public abstract void
	public void powerOn();

	public void powerOff();

	public void soundUp();

	public void soundDown();

	public void channelUp();

	public void channelDown();
}

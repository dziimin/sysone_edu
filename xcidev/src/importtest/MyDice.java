package importtest;

public class MyDice {
	public int getNumber(){
		int number = (int)(Math.random()*6)+1;
		
		return number;
	}
}

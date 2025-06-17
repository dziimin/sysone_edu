package control;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // new 가포함되어있음
		
		c.set(2024, 6-1, 10); // 날짜 변경 -> 월은 0부터 시작해서 실제월 -1
		int dayofweek = c.get(Calendar.DAY_OF_WEEK); // 요일
		System.out.println(dayofweek); // 1 일요일 2 월요일 3 화요일 ...
		//shift + f2 매뉴얼
		
		int end = c.getActualMaximum(Calendar.DAY_OF_MONTH); // 그달의 마지막 날
		System.out.println(end);
	}
}

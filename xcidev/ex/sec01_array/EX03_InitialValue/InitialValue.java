package sec01_array.EX03_InitialValue;

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		
		// 스택 메모리(강제 초기화 x)
		int value1;
		// System.out.println(value1); // 오류
		int[] value2;
		// System.out.println(value2); // 오류
		int value3 = 0;
		System.out.println(value3);
		int[] value4 = null;
		System.out.println(value4);
		System.out.println();
		
		
		// 힙 메모리 초깃값(강제 초기화)
		// @기본 자료형 배열
		boolean[] array1 = new boolean[3]; // false로 초기화
		for(int i =0; i <3 ;i++) {
			System.out.println(array1[i]+ " ");
		}
		System.out.println();
		

		int[] array2 = new int[3]; // 0으로 초기화
		for(int i =0; i <3 ;i++) {
			System.out.println(array2[i]+ " ");
		}
		System.out.println();
		

		double[] array3 = new double[3]; // 0.0으로 초기화
		for(int i =0; i <3 ;i++) {
			System.out.println(array3[i]+ " ");
		}
		System.out.println();
		
		
		// @참조 자료형 배열
		String[] array4 = new String[3]; // null로 초기화
		for(int i =0; i <3 ;i++) {
			System.out.println(array4[i]+ " ");
		}
		System.out.println();
		
		
		// 배열을 한번에 출력
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}
}

package control;

public class DoWhileTest2 {
	public static void main(String[] args) {
		
		// 1부터 1000까지 4의 배수의 합
		int sum=0;
		int i =4;
		do{
			sum += i;
			i+=4;
		}while(i<=1000);
		
		System.out.println(sum);
	}
}

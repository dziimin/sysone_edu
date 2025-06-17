package control;

public class WhileTest2 {
	public static void main(String[] args) {
		int sum =0;
		int n = 1;
		while (n <= 1000) {
			if(n%3==0) sum+=n;
			n++; //
		}
		
		System.out.println(sum);
		
		sum = 0;
		n = 3;
		while(n<=1000) {
			sum += n;
			n+=3;
		}
		System.out.println(sum);
	}
}

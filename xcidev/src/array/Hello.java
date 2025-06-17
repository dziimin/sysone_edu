package array;

public class Hello {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]:" +args[i]);
		}// 상단 툴바 > Run > Run Configurations... > Arguments > Program arguments 에 입력
		
		System.out.println();
		for(String str: args) {
			System.out.println("args[]:" + str);
		}
	}
}

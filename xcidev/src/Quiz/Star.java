package Quiz;

public class Star {
	public static void main(String[] args) {

		// 삼각형
		//*
		//**
		//***
		
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println();

		// 역삼각형
		// ***
		// **
		// *
		
		int k = 5;
		while (k > 0) {
			int l = k;
			while (l > 0) {
				System.out.print("*");
				l--;
			}
			System.out.println();
			k--;
		}

		System.out.println();

		// 교수님 vers
		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 6 - i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println();

		// 역삼각형2
		// ***
		//  **
		//   *
		
		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println();

		// 삼각형 2
		//   *
		//  **
		// ***

		i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (j >= 6 - i)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println();
	}
}

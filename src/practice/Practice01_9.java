package practice;

public class Practice01_9 {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 0; i < number; i++) {
			for (int j = 1; j <= number; j++) {
				int n = j + i;
				if(n > 5)
					n -= 5;
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}

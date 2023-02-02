package Practice;

public class Practice01_10 {

	public static void main(String[] args) {
		int number = 5;
		int n = 0;
		for(int i = number; i > 0; i--) {
			for(int j = 1; j <= number; j++) {
				if(i <= j) {
					if(++n >= 10)
						System.out.printf("%3d", n);
					else
						System.out.printf("%2d", n);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

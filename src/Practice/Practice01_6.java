package Practice;

public class Practice01_6 {

	public static void main(String[] args) {
		int number = 5;
		for(int i = number; i > 0; i--) {
			for(int j = 1; j <= number; j++) {
				if(i >= j)
					System.out.printf("%2d%s", j, " ");
			}
			System.out.println();
		}
	}

}

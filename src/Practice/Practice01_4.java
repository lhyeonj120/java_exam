package Practice;

public class Practice01_4 {

	public static void main(String[] args) {
		int number = 5;
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= number; j++) {
				if(i >= j)
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

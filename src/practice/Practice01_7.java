package practice;

public class Practice01_7 {

	public static void main(String[] args) {
		int number = 5;
		int n = 1;
		for(int i = number; i > 0; i--) {
			for(int j = 1; j <= number; j++) {
				if(i >= j)
					System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}

}

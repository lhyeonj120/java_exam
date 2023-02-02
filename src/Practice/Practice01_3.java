package Practice;

public class Practice01_3 {

	public static void main(String[] args) {
		int number = 5;
		int n = 1;
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number; j++) {
				System.out.print(n + " ");
				n += 2;
			}
			System.out.println();
		}
	}

}

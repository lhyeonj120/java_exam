package Practice;

public class Practice01_1 {

	public static void main(String[] args) {
		int number = 5;
		int n = 0;
		
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number; j++) {
				System.out.print(++n + " ");
			}
			System.out.println();
		}
	}

}

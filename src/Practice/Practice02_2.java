package Practice;

public class Practice02_2 {

	public static void main(String[] args) {
		int number = 5;
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number; j++) {
				if(i >= j)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}

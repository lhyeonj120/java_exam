package Practice;

public class Practice02_3 {

	public static void main(String[] args) {
		int number = 5;
		for(int i = number - 1; i >= 0; i--) {
			for(int j = 0; j < number; j++) {
				if(i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

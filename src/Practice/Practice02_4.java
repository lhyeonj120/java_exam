package Practice;

public class Practice02_4 {

	public static void main(String[] args) {
		int number = 5;
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number * 2; j++) {
				if(j >= number - i - 1 && j < number + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

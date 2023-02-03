package Practice;

public class Practice02_5 {

	public static void main(String[] args) {
		int number = 5;
		for(int i = 0; i < number * 2; i++) {
			for(int j = 0; j < number * 2; j++) {
				if(i < number) {
					if(j >= number - i + 1 && j < number + i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else {
					if(j >= i - 4)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

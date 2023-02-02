package practice;

public class Practice01_5 {
	
	public static void main(String[] args) {
		int number = 5;
		int n = 1;
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number; j++) {
				if(j <= i)
					System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}
	
}

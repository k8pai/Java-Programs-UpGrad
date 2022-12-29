import java.util.Scanner;

class Source {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);		
		// Enter number 1 in the Input Console
		int num1 = scan.nextInt();
		// Enter number 2 in the Input Console
		int num2 = scan.nextInt();
			
		int a = num1;
		int b = num2;
			
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
			
		int hcf = a;
		System.out.print(hcf);
		scan.close();
	}
}

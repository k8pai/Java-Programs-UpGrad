import java.util.Scanner;
class Source {
	public static void main(String[] args) {
		int myAge;
		int ageOfBrother;
		Scanner input = new Scanner(System.in);
		myAge = input.nextInt();
		ageOfBrother = input.nextInt();
		System.out.println(myAge < 25 && ageOfBrother < 25 && myAge > 0 && ageOfBrother>0);
	}
}

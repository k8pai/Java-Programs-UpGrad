import java.util.*;

public class Source {
	public static void main(String[] args) {
		int age;
		Scanner input= new Scanner(System.in);
		age=input.nextInt();
		if (age >= 21) {
			System.out.println("You are eligible to consume alcohol");
		} else {
			System.out.println("You are not eligible to consume alcohol. Go home kid!");
		}
	}
}

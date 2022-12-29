import java.util.*;

public class Source {
	public static void main(String[] args) {
		int X, Y;
		Scanner input= new Scanner(System.in);
		X=input.nextInt();
		Y=input.nextInt();
		if (X + Y > 30) {
			System.out.println("The person is telling the truth.");
		} else {
			System.out.println("The person is lying.");
		}
	}
}

import java.util.Scanner;

class Source {
    public static void main(String[] args) {
        // Get the input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Check if the number has 5 digits
		if(number >= 10000 && number <= 99999){

            // Extract the digits from the number using a loop
            int[] digits = new int[5];
            for (int i = 4; i >= 0; i--) {
                digits[i] = number % 10;
                number = number / 10;
            }

            // Print the digits in the correct order
            for (int el: digits) {
                System.out.println(el);
            }
		}else if(number > 99999){
			System.out.println("Error! Number more than 5 digits.");
		}else if(number < 10000){
			System.out.println("Error! Number less than 5 digits.");
		}
    }
}

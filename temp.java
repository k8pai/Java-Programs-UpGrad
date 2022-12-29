   
import java.util.Scanner;
class Source {
    public static void main(String[] args) {


    //Create new scanner
    Scanner input = new Scanner(System.in);

    //Values of each digit
    int tenThousands, thousands, hundreds, tens, ones;

    //Prompt user to input 5 digit number
       
    int number = input.nextInt();
    if (number > 99999) {
        System.out.println("\nError! Number more than 5 digits.");
        }
    else if (number < 10000) {
        System.out.println("Error! Number less than 5 digits.");
        }
    else if (10000<=number&&number<=99999){
        //WRITE YOUR CODE HERE
        for(int i=number, dig=10000; i>0; i/=10){
            System.out.println(number/dig%10);
            dig/=10;
        }
        }
     }
}

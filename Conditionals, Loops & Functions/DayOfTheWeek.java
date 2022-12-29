import java.util.Scanner;

class Source {}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// Enter month
		String month = scan.next();
		// Enter date
		int date = scan.nextInt();
		
		// Write the rest of the logic
		int day = 0;
		switch (month) {
			case "January":
			    day = date;
			    break;
			case "February": 
			    day = 31 + date;
			    break;
			case "March": 
			    day = 59 + date;
			    break;
			case "April": 
			    day = 90 + date;
			    break;
			case "May": 
			    day = 120 + date;
			    break;
			case "June": 
			    day = 151 + date;
			    break;
			case "July": 
			    day = 181 + date;
			    break;
			case "August": 
			    day = 212 + date;
			    break;
			case "September": 
			    day = 243 + date;
			    break;
			case "October": 
			    day = 273 + date;
			    break;
			case "November": 
			    day = 304 + date;
			    break;
			case "December": 
			    day = 334 + date;
			    break;
		}
		
		// From the day number of the year, finding the day no. of the week
		int dayNumber = day % 7;
		// recall, day 1 is Monday
		
		if (dayNumber == 6 || dayNumber == 0) {
			System.out.print("Hurray!");
		} else {
			System.out.print("Ohhh! It's a work day :|");
		}
		scan.close();
	}
}
import java.util.Scanner;
	public class L8T4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter a year: ");
		int year = sc.nextInt();

		if((year >= 2000) && (year <= 2020)){
		int days = numberOfDaysInAYear(year);
		System.out.print("Number of days in this year are: " + days);
		}
	}

	public static int numberOfDaysInAYear(int year){
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
		return 366;
		}
		else{
		return 365;
		}
	}
}
	
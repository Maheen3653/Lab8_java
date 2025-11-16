import java.util.Scanner;
public class L8T3{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter three numbers: ");
	double num1 = sc.nextDouble();
	double num2 = sc.nextDouble();
	double num3 = sc.nextDouble();
	displaySortedNumbers(num1,num2,num3);
}

	public static void displaySortedNumbers(double num1, double num2, double num3){
	double temp;
	if (num1 < num2){
	temp = num1;
	num1 = num2;
	num2 = temp;
	}

	if(num2 < num3){
	temp = num2;
	num2 = num3;
	num3 = temp;
	}
	
	if(num3 < num1){
	temp = num3;
	num3 = num1;
	num1 = temp;
	}
	
	System.out.println("Sorted numbers: " + num1 + " " + num2 + " " + num3);
	}
}
	

	
	
	

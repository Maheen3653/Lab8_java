import java.util.Scanner;
	public class L8T7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n){

		for(int row = 1; row<=n; row++){
			
		for(int column = 1; column<=n; column++){
		System.out.print(" " + (int)(Math.random() * 2));

		}
		System.out.println();

		}
	}
}
	

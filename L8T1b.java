public class L8T1b{
	public static void main(String [] args){
		 reverse(3456);
	}

	public static void reverse(int number){
	int reverse;
	while(number != 0){
	reverse = number % 10;
	System.out.print(reverse);
	number = number / 10;
	}
	}
}
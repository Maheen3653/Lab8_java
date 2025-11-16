public class L8T1a{
	public static void main(String [] args){
		int result = sumDigits(234);
	System.out.println("The sum is: " + result);
	}

	public static int sumDigits(int number){
	int result = 0;
	while(number != 0){
	result = result + (int)(number % 10);
	number = number / 10;
	}
	return result;
	}
}
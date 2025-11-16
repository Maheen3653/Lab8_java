import java.util.Scanner;
	public class L8T2{
	public static void main(String [] args){
		int num = 121;
		System.out.print(num + (isPalindrome(num)? " is a palindrome" : " is not a palindrome"));
	}	

	public static int reverse(int number){
	int reverse = 0;
	int digit;
	while(number !=0){
	digit = number % 10;
	reverse = reverse * 10 + digit;
	number = number / 10;
	}
	return reverse;
	}

	public static boolean isPalindrome(int number){
	boolean result = number == reverse(number);
	return result;
	}

}

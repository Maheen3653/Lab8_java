import java.util.Scanner;
	public class L8T5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int result = countLetters(str);
		System.out.println("Number of letters are: " + result);
	}		

	public static int countLetters(String str){
		int count = 0;
		for(int i = 0; i<str.length(); i++){
		
		if(Character.isLetter(str.charAt(i))){
		count++;
		}
	}
		return count;
	}
}
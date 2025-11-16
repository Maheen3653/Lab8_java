import java.util.Scanner;
	public class L8T6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a single word: ");
		String word = sc.nextLine();
		capitalizeLower_case_word(word);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String result = capitalize(str);
		System.out.print("Output: " + result);

		}


	public static void capitalizeLower_case_word(String word){
		System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));
	}
	
	public static String capitalize(String str){
		String result = "";
		for(int i = 0; i<=str.length()-1; i++){
			if((i == 0) || (str.charAt(i-1) == ' ')){
			result += Character.toUpperCase(str.charAt(i));
			}
			else{
			result += str.charAt(i);
			}
		}
		return result;
	}
}
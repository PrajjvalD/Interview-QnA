import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Write a function to determine if a given string is a palindrome. \n"
				+ "A palindrome is a word, phrase, number, or other sequence of characters that \n"
				+ "reads the same forward and backward.\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Palindrome String: ");
		String n = scanner.nextLine();
		
		// String traverse
		// for (int i=0;i<n.length();i++) {
		//	char c = n.charAt(i);
		//	System.out.println(c);
		// }
				
		StringBuilder sb=new StringBuilder(n);  
	        sb.reverse();  
		if (n.equalsIgnoreCase(sb.toString())) {
			System.out.println("it is a palindrome number");
		}else {
			System.out.println("it is not a palindrome number");
		}
		scanner.close();
	}

}

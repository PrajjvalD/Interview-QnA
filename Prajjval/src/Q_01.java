
public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a program that prints the numbers from 1 to 100. \n"
							+ "But for multiples of three, print “Fizz” instead of the number, and for the multiples of five, print “Buzz”. "
							+ "\nFor numbers that are multiples of both three and five, print “FizzBuzz”.");
		System.out.println("Solution:");
		
		for(int i=1;i<=100;i++) {
			if((i%3 == 0) && (i%5 == 0)) {
				System.out.println("FizzBuzz");
			}else if(i%3 == 0) {
				System.out.println("Fizz");
			}else if(i%5 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
			
		}
	}

}

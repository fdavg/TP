
public class Principale {
//voila la modification avant le push
//ok c'est dada
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 200; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println("FizzBuzz");

			}//if
		}//For
	}// Main 
//suis cool
}

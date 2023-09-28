import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
	Scanner sc = new Scanner(System.in);   	 
    	
    if(sc.hasNextDouble()){
        double guess = sc.nextDouble();

        if(guess == rnd_number){
            System.out.println("Congratulations, you guessed right!");
        }else if(guess>rnd_number){
            System.out.println("Your guess is higher than the answer");
            makeAGuess();
        }else if ( guess< rnd_number){
            System.out.println("Your guess is lower than the answer");
            makeAGuess();
        }else{
            System.out.println("Input was not numeric");
            makeAGuess();
        }
    }
}   
}

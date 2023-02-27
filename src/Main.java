import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        double fahr;
        int celc = 0;
        int check = 2;
        //prompt user to enter the temperature
        System.out.println("What is the temperature in Celsius?");
        //take the user input
        //check if the user input is correct
        if (!input.hasNextInt()) {
            check = 1;
        }
        else {
            celc = input.nextInt();
        }
        //enter loop until user gets it right if wrong
        while (check == 1) {
            System.out.println("Sorry, you did not enter a valid input. Please enter an integer twice. Try again.");
           //using new scanner was the only way it would stop looping, but it makes me input twice
            if (new Scanner(System.in).hasNextInt()) {
                celc = new Scanner(System.in).nextInt();
                check = 2;
            }
            else {
                check = 1;
            }
        }
        //do math
        fahr = (celc * 1.8) + 32 ;
        System.out.println("The temperature in Fahrenheit is " + fahr );
    }
}
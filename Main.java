import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        Random r = new Random();

        boolean flag = true;
        int numberToGuess = r.nextInt(100) + 1;

        System.out.println("Input the number from 1-100");
        while(flag){
            int userGuess = txt.nextInt();
            if(userGuess == numberToGuess){
                System.out.println("Yes! The number is " + numberToGuess);
                flag = false;
            }else if(userGuess > numberToGuess){
                System.out.println("Number too high.");
                System.out.println("Try again. Input the number from 1-100");
            }else{
                System.out.println("Number too low.");
                System.out.println("Try again. Input the number from 1-100");
            }
        }
    }
}

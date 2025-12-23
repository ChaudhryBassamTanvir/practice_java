import java.util.Scanner;

public class GuessNumberGame {
    public static void guess(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int min = 1;
int max = 10;
int guessNumber=(int)(Math.random()*(max-min+1))+min;
      if (number!=guessNumber) {
        System.out.println("You lose!");
        guess();
      }else{
        System.out.println("You win");
      }
    }
    public static void main(String[] args) {
    System.out.println("You ready lets start the game");        

        guess();
    }
}


import java.util.Scanner;

public class ATM {

    public static boolean check(int pin){
                      Scanner sc = new Scanner(System.in);
                      System.out.println("The card inserted successfully Please enter your 4 digit pin ");
                      int pinCheck = sc.nextInt();
                      if (pin!=pinCheck) {
                        return false; 
                      }
                      return true;

    }

    public static void logIn(int pin,int balance){
            if (check(pin)) {
                System.out.println("Welcome");
            
                switch () {
                    case :
                        
                        break;
                    default:
                        throw new AssertionError();
                }
                
            }
    }

    public static void ask(int password,int balance){
              Scanner sc = new Scanner(System.in);
        System.out.println("1. Yes");
     System.out.println("2. No");
     int option= sc.nextInt();   

     switch (option) {
         case 1:
            System.out.println("He want to do transction");
         logIn(password, balance);
         case 2:
            break;
         default:
             throw new AssertionError();
     }

    }

    public static void passwordAndBalance(){
       Scanner sc = new Scanner(System.in);
       int password;
       int balance;
       System.out.println("Please enter the password 4 digit password ");
               password=sc.nextInt();

       if (String.valueOf(password).length()>4) {
        System.out.println("Please re enter your password it must be of 4-digits ");
        passwordAndBalance();
        
       }else{
    System.out.println("Enter the initial amount you want ");
       balance=sc.nextInt();
       
       ask(password,balance);
       }
    }
    public static void main(String[] args) {
       
   passwordAndBalance();
    
    }
}

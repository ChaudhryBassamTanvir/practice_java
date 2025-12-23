
import java.util.Scanner;

public class ATM {
      public static int balance;
    public static boolean check(int pin){
                      Scanner sc = new Scanner(System.in);
                      System.out.println("The card inserted successfully Please enter your 4 digit pin ");
                      int pinCheck = sc.nextInt();
                      if (pin!=pinCheck) {
                        System.out.println("incorrect password");
                        check(pin); 
                      }
                      return true;

    }
    public static void cashwithdrawal(){
                      Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount you wanna withdraw");
        int amount= sc.nextInt();
        System.out.println("Please receive your cash");
        if (amount>balance) {
            System.out.println("Insufficient balance  please deposit cash ");
            askAgain();
        }
        balance-=amount;
        askAgain();
    }
    public static void deposit(){
                      Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount you wanna submit");
        System.out.println("Please put the amount in cash deposit machine");        
        int amount = sc.nextInt();
        balance+=amount;
        askAgain();

    }
    public static void askAgain(){
              Scanner sc = new Scanner(System.in);
        System.out.println("You want any other transaction");
        System.out.println("1. Yes");
        System.out.println("1. No");
        int option= sc.nextInt();
        switch (option) {
            case 1:
                details(balance);
            case 2:
                System.out.println("Thank you for using this ATM");
                break;
            default:
                throw new AssertionError();
        }

    }
    public static void checkBalance(){
System.out.println("Your current balance is " + balance);
askAgain();
    }

    public static void details(int balance){
                      Scanner sc = new Scanner(System.in);

        System.out.println("1. Cash Withdrawal ");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                cashwithdrawal();
            case 2:
                deposit();
            case 3:
                checkBalance();
            case 4:
                System.out.println("Thank you for using this ATM");
                break;
            default:
                break;
        }
    }

    public static void logIn(int pin,int balance){
            if (check(pin)) {
                System.out.println("Welcome");
                details(balance);
                
            }
    }

    public static void ask(int password,int balance){
              Scanner sc = new Scanner(System.in);
              System.out.println("Password and amount saved do you want to do any tranaction ");
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

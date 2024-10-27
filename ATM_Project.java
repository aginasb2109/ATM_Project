import java.util.*;
public class ATM_Project {
    public static void main(String args[]){
     int pin=2109;
     int balance=10000;
     String name;
     int withdraw=0;
     int addAmount=0;


     Scanner scan= new Scanner(System.in);
     System.out.println("Enter Your password: ");
     int password=scan.nextInt();
     if(password==pin){
        System.out.println("Enter you Name: ");
        name=scan.next();
        System.out.println("Welcome, "+name);

        while(true){
            System.out.println("----------------------------------------------");
            System.out.println("Enter 1. to know your Balance");
            System.out.println("Enter 2. to add amount to your account");
            System.out.println("Enter 3. withdraw the amount");
            System.out.println("Enter 4. receive the receipt");
            System.out.println("Enter 5.to exit");
            System.out.println("-----------------------------------------------");

            int opt=scan.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Your Current balance is: "+balance);
                    break;
                
                case 2:
                
                    System.out.println("Enter the amount to be added:");   
                    addAmount=scan.nextInt();
                    balance+=addAmount;
                    System.out.println("Sucessfully credited");
                    break;


                case 3:
                    System.out.println("Enter the amount to Withdraw:");
                    withdraw= scan.nextInt();
                    if(balance>withdraw){
                    balance-=withdraw;
                    System.out.println("Successfully Debited");
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                 
                case 4:
                System.out.println("--------------------------------------------");
                 System.out.println("Thanks for trusting us, your  details are:");
                 System.out.println("Available balance" +balance);
                 System.out.println("Amount deposited " +addAmount);
                 System.out.println("Amount withdrawn" +withdraw);
                 System.out.println("----------------------------------------------");
                 break;


                
            }
            if(opt==5){
                    System.out.println("Thank you");
                    break;
            }
            else{
                System.out.println("Enter below 5");
                break;
            }
                





            


        }

     }
    
     

    
    else{
        System.out.println("Incorrect password!");
        
    }
}
}


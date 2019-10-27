package store;

import java.util.Scanner;

public class Signup {
    
    int choice;
    public Signup(int a){
       // Scanner scanner = new Scanner(System.in);
        //System.out.println(" Sign up as \n 1)Customer \t 2)Supplier \n Enter your choice");
        this.choice = a;

    }
    public  Customer signup() {
        
        Scanner scanner = new Scanner(System.in);
        //System.out.println(" Sign up as \n 1)Customer \t 2)Supplier \n Enter your choice");
        //int choice = scanner.nextInt();
        if (choice == 1) {

            System.out.println("Enter your email: ");
            String username = scanner.next();
            String password = scanner.next();
            double mob = scanner.nextDouble();

            Customer temp;
            temp = new Customer(username, password, mob);
            return temp;
        }
        else
                return new Customer("qft","ert",80.0);
        
    }
        public Supplier signupS(){
                           Scanner scanner = new Scanner(System.in);
       // System.out.println(" Sign up as \n 1)Customer \t 2)Supplier \n Enter your choice");
       // int choice = scanner.nextInt();
             
            //if (choice == 2) {


                System.out.println("Enter your email: ");
                String username = scanner.next();
                System.out.println("Enter your password");
                String password = scanner.next();

                System.out.println("Enter your mobile number");
                double mob = scanner.nextDouble();

                Supplier temp = new Supplier(username, password, mob);
                System.out.println(temp.email + temp.pass );
                return temp;
            }
        }
    
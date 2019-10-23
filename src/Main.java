

import java.util.Scanner;
import javaapplication3.cashondelivery;
import javaapplication3.displaypayment;
import javaapplication3.netbanking;
import javaapplication3.upi;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Customer customers[] = new Customer[100];
        Supplier suppliers[] = new Supplier[100];
        int choice = 0;
        do{
        System.out.println("1)Sign up \t 2)Login \t 3)supplier Login \t 4)supplier sign up 5)exit \n Enter your choice");

        choice = scanner.nextInt();
        if (choice == 1) {
            Signup signup = new Signup(choice);
            Customer a = signup.signup();
            System.out.println(a.username);
            customers[0] = a;
            //customers[0].defaults();
        }
        if(choice == 4)
        {
            Signup signup =new Signup(choice);
            Supplier a = signup.signupS();
            suppliers[0] = a;
            suppliers[0].defaults();
            
        }
        if(choice == 2){
           // Login login = new Login();
            String loginusername = scanner.next();
            String loginpassword = scanner.next();
            for (Customer customer : customers) {
                System.out.println(loginusername);
                System.out.println(customers[0].username);
                if (loginusername.equals(customers[0].username) && loginpassword.equals(customers[0].pass)) {
                    System.out.println("Login Success");
                    Customer current = customers[0];
                    current.defaults(suppliers);
                } else {
                    System.out.println("Login failed");
                }
                
            }
        }

        if(choice == 3){
            String loginusername = scanner.nextLine();
            String loginpassword = scanner.nextLine();
            for(int i=0;i<customers.length;i++){
                if(loginusername == customers[i].username && loginpassword == customers[i].pass){
                    System.out.println("Login Success");
                    Customer current = customers[i];
                    current.defaults(suppliers);
                }
                else
                    System.out.println("Login failed");
            }
        }
        }while(choice !=5);
       /* displaypayment dp = new displaypayment();
        cashondelivery cod = new cashondelivery();
        netbanking nb = new netbanking();
        upi upi = new upi();
        dp.display();
        
        choice  = scanner.nextInt();
        
        if(choice == 1)
        {
            cod.verify();
        }
        else
            if(choice == 2)
            {
                nb.verify();
            }
        else
                if(choice == 3)
                {
                    upi.verify();
                }
        else
                {
                    System.out.println("Invalic input");
                }
        
        
        
    }*/



    }












































}




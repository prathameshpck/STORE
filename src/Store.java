/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;
import store.Address;
import store.upi;
import store.Signup;
import store.Customer;
import store.Cart;
import store.Supplier;
import store.Node;
import java.util.Scanner;
import store.Item;

/**
 *
 * @author gudod
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customers[] = new Customer[100];
        Supplier suppliers[] = new Supplier[100];
        int Ccount = 0;
        int Scount = 0;
        int choice = 0;
        do {
            System.out.println("1)Customer Sign up \t 2) Customer Login \n 3)Supplier Login \t 4)supplier sign up \n 5)exit \n Enter your choice");

            choice = scanner.nextInt();
            if (choice == 1) {
                Signup signup = new Signup(choice);
                Customer a = signup.signup();
                //System.out.println(a.username);
                customers[Ccount++] = a;
                //customers[0].defaults();
            }
            if (choice == 4) {
                Signup signup = new Signup(choice);
                Supplier a = signup.signupS();
                suppliers[Scount++] = a;
                //suppliers[0].defaults();

            }
            if (choice == 2) {
                // Login login = new Login();
                String loginusername = scanner.next();
                String loginpassword = scanner.next();
                for (Customer customer : customers) {
                    //System.out.println(loginusername);
                    //System.out.println(customers[0].username);
                    if (loginusername.equals(customers[0].username) && loginpassword.equals(customers[0].pass))
                    {
                        System.out.println("Login Success");
                        Customer current = customers[0];
                        current.defaults(suppliers);
                        break;
                    } else {
                        System.out.println("Login failed");
                    }

                }
            }

            if (choice == 3) {
                String loginusername = scanner.next();
                String loginpassword = scanner.next();
                System.out.println(loginpassword + loginusername);
                for (int i = 0; i < suppliers.length; i++)
                    if((loginpassword.equals(suppliers[i].pass)) && (loginusername.equals(suppliers[i].email)))
                    {
                        System.out.println("Login Success");
                        Supplier current = suppliers[i];
                        current.defaults();
                        break;
                    }
                    else
                        System.out.println("Login failed");
            }
        } while (choice != 5);

    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
//
//
//       displaypayment dp = new displaypayment();
//        cashondelivery cod = new cashondelivery();
//        netbanking nb = new netbanking();
//        upi upi = new upi();
//        dp.display();
//
//        int ch  = scanner.nextInt();
//
//        switch (ch) {
//            case 1:
//                cod.verify();
//                break;
//            case 2:
//                nb.verify();
//                break;
//            case 3:
//                upi.verify();
//                break;
//            default:
//                System.out.println("Invalic input");
//                break;
//        }
//
//}
//
//
//
//    }

    



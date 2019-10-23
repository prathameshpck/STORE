
package javaapplication3;

import java.util.Scanner;


public class JavaApplication3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displaypayment dp = new displaypayment();
        cashondelivery cod = new cashondelivery();
        netbanking nb = new netbanking();
        upi upi = new upi();
        dp.display();
        
        int choice  = sc.nextInt();
        
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
        
        
        
    }
    
}


package javaapplication3;


public class cashondelivery implements Payment {
  
    @Override
    public void display(){
        System.out.println("Select the type of Payment:\n 1.Cash On Delivery \n 2.Net Banking \n 3.Credit Card");
    }

    @Override
    public void verify() {
        System.out.println("Payment Successful.Your Order is Confirmed");
    }
}
    


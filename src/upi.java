
package javaapplication3;


public class upi implements Payment {
    @Override
    public void verify() {
        System.out.println("Payment Successful.Your Order is Confirmed--UPI Selected");
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

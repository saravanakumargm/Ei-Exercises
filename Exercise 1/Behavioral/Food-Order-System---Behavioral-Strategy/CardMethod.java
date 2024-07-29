public class CardMethod implements PaymentStrategy{
    protected String cardNumber;
    @Override
    public void paymentMethod(){
        try{
            System.out.println("Enter Card Number : ");
             cardNumber = PaymentStrategy.sc.next();
            System.out.println("Processing payment...");
            Thread.sleep(3000);
            System.out.println("Payment Successful\n");
        }catch (Exception e){
            System.out.println("An error occurred");
        }
    }
}

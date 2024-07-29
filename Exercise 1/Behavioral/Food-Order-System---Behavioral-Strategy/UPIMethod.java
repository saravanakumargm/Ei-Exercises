public class UPIMethod implements PaymentStrategy{
    protected String upiId;
    @Override
    public void paymentMethod(){
        try{
            System.out.println("Enter UPI Id : ");
            upiId = PaymentStrategy.sc.next();
            System.out.println("Processing Payment...");
            Thread.sleep(3000);
            System.out.println("Payment Successful\n");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class SavingsAccount extends Account{
    @Override
    public void getCustomerDetails(Account details) {
        System.out.println("----------Account Details----------\n");
        System.out.println("Name : " + details.name + "\nMobile Number : " + details.mobNo + "\nAccount Type : Savings" );
        System.out.println("\n\t\t\tAccount Created Successfully!");
    }


}

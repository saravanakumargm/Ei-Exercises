public class CurrentAccount extends Account{
    @Override
    public void getCustomerDetails(Account details) {
        System.out.println("----------Account Details----------\n");
        System.out.println("Name : " + details.name + "\nMobile Number : " + details.mobNo + "\nAccount Type : Current");
        System.out.println("\n\t\t\tAccount Created Successfully!");
    }
}

public class BankBranch {
    private AccountFactory factory;//single responsibility
    BankBranch(AccountFactory factory){
        this.factory = factory;
    }
    public static void main(String[] args) {
        BankBranch branch = new BankBranch(new BankBranchFactory());
        Account account = branch.openAccount("SaravanaKumar","9080977652","26848268113",1);
        account.getCustomerDetails(account);//open close,can expand but cant modify
    }
    public Account openAccount(String name,String mobNo, String aadharNo, int accountType){
        return factory.createAccount(name,mobNo,aadharNo,accountType);//less dependency
    }
}

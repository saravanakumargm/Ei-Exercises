
public class BankBranchFactory implements AccountFactory{
    Account account;

    @Override

    public Account createAccount(String name, String mobNo, String aadharNo,int accountType) {

        if(accountType==1){
            account = new SavingsAccount();
            account.name = name;
            account.mobNo = mobNo;
        } else if (accountType==2) {
            account = new CurrentAccount();
            account.name = name;
            account.mobNo = mobNo;
        }else {
            throw new IllegalArgumentException("Invalid Account Type!");
        }
        return account;
    }


}

import java.security.PublicKey;
import java.util.Scanner;

public class SimpleIssueHandler extends AbstractHandler{
    protected String password;
    Scanner sc = new Scanner(System.in);
    @Override
    public void handle(int issue){
        if(issue==1){

            System.out.println("Enter new password : ");
             password = sc.next();
             if(password.length()>=8){
                    System.out.println("Password Changed!");
                }else{
                    System.out.println("Password Should be at least 8 characters");
                }
        }
        this.nextHandler.handle(issue);
    }
}

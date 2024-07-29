import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MediumIssueHandler extends AbstractHandler{
    String name,mobNum,emailId;
    Scanner sc = new Scanner(System.in);

    void changeName(){
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Name Changed!");
    }
    void  changeMobileNumber(){
        System.out.println("Enter Mobile Number : ");
        mobNum = sc.next();
        if(mobNum.length()==10){
            System.out.println("Mobile Number Changed!");
        }else{
            System.out.println("Invalid Mobile Number!");
        }
    }
    void changeEmail(){
        System.out.println("Enter Email Id : ");
        emailId = sc.next();
        System.out.println("Email Id Changed!");
    }
    @Override
    public void handle(int issue){
        if(issue==2){
            System.out.println("1.Change Name 2.Change Mobile Number 3.Change Email");
            int response = sc.nextInt();
            MediumIssueHandler changes = new MediumIssueHandler();
            if(response<4 && response>0){
                switch (response){
                    case 1:
                        changes.changeName();
                        break;
                    case 2:
                        changes.changeMobileNumber();
                        break;
                    case 3:
                        changes.changeEmail();
                        break;
                }
            }else{
                System.out.println("Invalid Entry");
            }
        }
        this.nextHandler.handle(issue);
    }
}

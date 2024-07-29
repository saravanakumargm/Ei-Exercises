import java.util.Scanner;

public class SupportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupportSystem support = new SupportSystem();
        Handler supportHandle = support.getValidationHandlers();
        try{
            System.out.println("\tTell Your Issues\n 1.Password Reset 2.Account Modification 3.Application Issues");
            int issue = sc.nextInt();
            if(issue>0 && issue<4){
                supportHandle.handle(issue);
            }else{
                System.out.println("Invalid Selection");
            }

        }catch (Exception e){
            System.out.println("An error has occurred!");
        }
    }
    public Handler getValidationHandlers(){
        SimpleIssueHandler simple = new SimpleIssueHandler();
        MediumIssueHandler medium = new MediumIssueHandler();
        ComplexIssueHandler complex = new ComplexIssueHandler();

        simple.setNextHandler(medium);
        medium.setNextHandler(complex);
        return  simple;
    }
}

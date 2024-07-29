import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderFood {

    public static void main(String[] args) {
        Food order = new Food();
        PaymentContext paymentContext = new PaymentContext();
        System.out.println("\t\tMenu\n1.Combo 1 : Dosa x1,Idly x2,Chicken Gravy,Soup\n" +
                        "2.Combo 2 : Dosa x1,Idly x2,Mutton Gravy,Soup\n" +
                "3.Combo 3 : Dosa x2,Idli x2,Mutton Gravy,Soup,Butter Chicken\n"
                );

        Scanner sc = new Scanner(System.in);
        Map<Integer,Strategy> comboMap = new HashMap<>();
        comboMap.put(1,new ComboOne());
        comboMap.put(2,new ComboTwo());
        comboMap.put(3,new ComboThree());
        int userResponse = sc.nextInt();


        Map<Integer,PaymentStrategy> payment = new HashMap<>();
        payment.put(1, new UPIMethod());
        payment.put(2,new CardMethod());

        Strategy userCombo = comboMap.get(userResponse);
        if(userCombo!=null){
            order.setMyMethod(userCombo);
            System.out.println(order.getFoodCost());
            System.out.println("Select payment Method : \n1.UPI\n2.Card");
            int paymentMethod = sc.nextInt();
            PaymentStrategy userPaymentMethod = payment.get(paymentMethod);
            paymentContext.setPaymentStrategy(userPaymentMethod);
            paymentContext.getPaymentMethod();
        }else{
            System.out.println("Invalid Input");
        }
        System.out.println("\t\t!!!Thank You!!!");


    }
}

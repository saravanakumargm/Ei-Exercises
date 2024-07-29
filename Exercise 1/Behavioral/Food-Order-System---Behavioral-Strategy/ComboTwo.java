public class ComboTwo implements Strategy{
    @Override
    public  double foodCost(){
        description();
        return 149;
    }
    public void description(){
        System.out.println("\t\tYour food is getting ready!\nTotal Bill : ");
    }
}

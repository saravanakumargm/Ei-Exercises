public class ComboOne implements Strategy{
    @Override
    public double foodCost(){
        description();
        return 119;
    }
    public void description(){
        System.out.println("\t\tYour food is getting ready!\nTotal Bill : ");
    }
}

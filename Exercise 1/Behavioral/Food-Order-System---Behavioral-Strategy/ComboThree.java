public class ComboThree implements Strategy{
    @Override
    public double foodCost(){
        description();
        return 199;
    }
    public void description(){
        System.out.println("\t\tYour food is getting ready!\nTotal Bill : ");
    }
}

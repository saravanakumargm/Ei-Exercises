public class SuiteRoom implements Room{

    @Override
    public void getRoomDetails() {
        System.out.println("Person : 2");
        System.out.println("Price : 1400/day");
    }

    @Override
    public double getPrice() {
        return 1400;
    }
}

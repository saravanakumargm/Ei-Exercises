public class NormalRoom implements Room{

    @Override
    public void getRoomDetails() {
        System.out.println("Person : 1");
        System.out.println("Price : 800/day");
    }

    @Override
    public double getPrice() {
        return 800;
    }
}

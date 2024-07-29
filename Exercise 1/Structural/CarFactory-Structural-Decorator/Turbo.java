public class Turbo extends CarDecorator{
    Turbo(Car car) {
        super(car);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Super Turbo added!";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200000;
    }
}

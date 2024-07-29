public class ChooseColor extends CarDecorator{
    String color;

    ChooseColor(Car car,String color) {
        super(car);
        this.color = color;

    }

    @Override
    public String getDetails() {
        return super.getDetails() + " With " + color + " Color";
    }

    @Override
    public double getPrice() {
        return new AdditionalSeats(car).getPrice();
    }
}

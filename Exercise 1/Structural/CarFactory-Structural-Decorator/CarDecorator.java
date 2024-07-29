public class CarDecorator implements Car{
    Car car;
    CarDecorator(Car car){

        this.car = car;
    }

    @Override
    public String getDetails() {
        return car.getDetails();
    }

    @Override
    public double getPrice() {

        return car.getPrice();
    }
}

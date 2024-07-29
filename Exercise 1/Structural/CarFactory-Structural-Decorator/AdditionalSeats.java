public class AdditionalSeats extends CarDecorator{
    AdditionalSeats(Car car) {
        super(car);
    }
    @Override
    public String getDetails(){
        return car.getDetails() + " + 2 seats added";
    }

    @Override
    public double getPrice(){

        return car.getPrice()+100000;
    }
}

public class AdditionalSeats extends CarDecorator{
    protected boolean isSeatsAdded = false;
    AdditionalSeats(Car car) {
        super(car);
        isSeatsAddes = true;
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

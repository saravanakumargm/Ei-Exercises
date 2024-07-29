public class MyCar implements Car{
    int carPrice;
    @Override
    public String getDetails() {
        return "4 Seater with 2 Airbags";
    }

    @Override
    public double getPrice() {
        carPrice=799999;
        return carPrice;
    }
}

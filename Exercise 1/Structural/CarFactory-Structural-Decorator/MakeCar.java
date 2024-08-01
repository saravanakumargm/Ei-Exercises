public class MakeCar {
    public static void main(String[] args) {
        Car car = new MyCar();
        System.out.println(car.getDetails());
        System.out.println(car.getPrice());

        Car seats = new AdditionalSeats(new MyCar());
        System.out.println(seats.getDetails());
        System.out.println(seats.getPrice());

        Car color = new ChooseColor(new MyCar(),"Red");
        System.out.println(color.getDetails());
        System.out.println(color.getPrice());
        
        Car turbo = new Turbo(car);
        System.out.println(turbo.getDetails());
        System.out.println(turbo.getPrice());


    }
}

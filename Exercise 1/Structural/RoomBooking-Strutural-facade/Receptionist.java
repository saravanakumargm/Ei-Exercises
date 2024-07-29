public interface Receptionist {
    public void getNormalRoomDetails();
    public void getSuiteRoomDetails();
    public double getPrice(int roomType);

    double getPrice(int roomType, int days);
}

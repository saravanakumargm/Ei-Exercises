public class GetRoom implements Receptionist{
    @Override
    public void getNormalRoomDetails() {
        new NormalRoom().getRoomDetails();
    }

    @Override
    public void getSuiteRoomDetails() {
        new SuiteRoom().getRoomDetails();
    }

    @Override
    public double getPrice(int roomType) {
        return 0;
    }

    @Override
    public double getPrice(int roomType, int days) {
        if(roomType==0)
            return new NormalRoom().getPrice()*days;
        return new SuiteRoom().getPrice()*days;
    }
}

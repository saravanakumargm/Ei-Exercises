public class SatelliteState extends CollectData{
    static void showSatelliteState(){
        System.out.println("Orientation : "+Rotate.getOrientation());
        System.out.println("Panel Status : " +SolarPanels.getStatus());
        System.out.println("Collected Data : "+CollectData.getCollectedData());
        System.out.println( );
    }
}

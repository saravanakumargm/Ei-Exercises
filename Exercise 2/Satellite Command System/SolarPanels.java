public class SolarPanels extends  Rotate{
    static protected String status = "Inactive";

    static void activatePanels(){
        System.out.println("Panels Activateds");
        status = "Active";
    }

    static String getStatus(){
        return status;
    }
}

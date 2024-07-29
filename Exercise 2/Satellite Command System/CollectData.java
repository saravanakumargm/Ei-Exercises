import java.util.Collections;

public class CollectData extends SolarPanels{
    static private int collectedData;


    static void collectData(){

        if(status.equals("Active")) {
            collectedData = collectedData + 10;
            System.out.println("Data Collected");
        }else{
            System.out.println("Panels are not active!");
        }
    }
    static int getCollectedData(){
        return collectedData;
    }

}

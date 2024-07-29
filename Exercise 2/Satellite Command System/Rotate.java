import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;
import java.util.SplittableRandom;

public class Rotate {
    static private String orientation = "South";
    static private int isValidOrientation=0;
    Rotate(){
        orientation = "North";
    }
    static void rotateSatellite(String direction) {
        if (direction.equals("South") || direction.equals("North") || direction.equals("East") || direction.equals("West")){
            orientation = direction;
            isValidOrientation=1;
        }else {
            System.out.println("Invalid Orientation!");
        }
    }

    static String getOrientation(){
        return orientation;
    }
    int getIsValidOrientation(){
        return isValidOrientation;
    }
}

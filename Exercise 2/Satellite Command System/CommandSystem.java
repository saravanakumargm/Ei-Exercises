import java.util.Scanner;

public class CommandSystem {

     void operations(int userInput){
        switch (userInput){
            case 1:
                System.out.println("Enter Direction : ");
                String direction = sc.next();
                Rotate.rotateSatellite(direction);
                break;
            case 2:
                SolarPanels.activatePanels();
                break;
            case 3:
                CollectData.collectData();
                break;
            case 4:
                SatelliteState.showSatelliteState();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            CommandSystem system = new CommandSystem();
            int userInput=0;
            while(userInput<5){
                System.out.println("1.Rotate 2.Activate Panels 3.Collect Data 4.Show Satellite State 5.Exit");
                userInput = sc.nextInt();
                system.operations(userInput);
            }
        }catch (Exception e){
            System.out.println("An error has occurred!");
        }

    }
}

import java.util.Scanner;

public class BookRoom {
    public static void main(String[] args) {
        Receptionist room = new GetRoom();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter room type : \n1.Normal Room\n2.Suite Room");
        int roomType = sc.nextInt();
        System.out.println("Enter number of days : ");
        int days = sc.nextInt();
        if(roomType==1){
            room.getNormalRoomDetails();
            System.out.println("Total Price : ");
            System.out.println(room.getPrice(roomType-1,days));
        }else {
            room.getSuiteRoomDetails();
            System.out.println("\nTotal Price : ");
            System.out.println(room.getPrice(roomType-1,days));
        }


    }
}

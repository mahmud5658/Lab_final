package report1;

public class Room {
    private int roomNo;
    private String roomType;
    private double roomArea;
    private boolean acMachine;

    public void setRoomData(int roomNo, String roomType, double roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    public void displayRoomData() {
        System.out.println("Room number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " square feet");
        System.out.println("AC Machine: " + acMachine);
    }

    public static void main(String[] args) {
        Room a1 = new Room();
        a1.setRoomData(507, "Bed Room", 132.5, true);
        a1.displayRoomData();
    }
}

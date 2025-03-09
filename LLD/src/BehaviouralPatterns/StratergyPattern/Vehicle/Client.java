package BehaviouralPatterns.StratergyPattern.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle ferrari = new SportsVehicle();
        ferrari.drive();
        Vehicle hammer = new OffRoadVehicle();
        hammer.drive();
        Vehicle volksWagon = new PassengerVehicle();
        volksWagon.drive();
    }
}

package BehaviouralPatterns.StratergyPattern.Vehicle.Stratergy;

public class NormalDrive implements DriveStratergy{
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}

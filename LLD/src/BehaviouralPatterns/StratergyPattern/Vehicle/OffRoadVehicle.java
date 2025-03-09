package BehaviouralPatterns.StratergyPattern.Vehicle;

import BehaviouralPatterns.StratergyPattern.Vehicle.Stratergy.SportsDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportsDrive());
    }
}

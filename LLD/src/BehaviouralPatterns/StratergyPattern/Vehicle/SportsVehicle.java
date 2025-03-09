package BehaviouralPatterns.StratergyPattern.Vehicle;

import BehaviouralPatterns.StratergyPattern.Vehicle.Stratergy.SportsDrive;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDrive());
    }
}

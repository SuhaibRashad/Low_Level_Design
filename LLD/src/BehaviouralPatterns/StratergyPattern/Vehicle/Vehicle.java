package BehaviouralPatterns.StratergyPattern.Vehicle;

import BehaviouralPatterns.StratergyPattern.Vehicle.Stratergy.DriveStratergy;

public class Vehicle {
    DriveStratergy stratergy;

    Vehicle(DriveStratergy stratergy){
        this.stratergy = stratergy;
    }
    public void drive(){
        stratergy.drive();
    }

}

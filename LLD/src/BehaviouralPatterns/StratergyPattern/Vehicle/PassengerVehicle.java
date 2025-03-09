package BehaviouralPatterns.StratergyPattern.Vehicle;


import BehaviouralPatterns.StratergyPattern.Vehicle.Stratergy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(){
        super(new NormalDrive());
    }
}

package CreationalPatterns.FactoryDesignPattern;




class TransportFactory {
     static Transport createFactory(String TransportType) {
        //Direct create objects
        switch (TransportType) {
            case "CAR":
                return new Car();


            case "BIKE":
                return new Bike();


            case "BUS":
                return new Bus();


            default:

                throw new IllegalArgumentException("No TransportType available as per your request");
        }

    }
}

public class WithFactoryPattern {
    public static void main(String[] args) {
        Transport service = TransportFactory.createFactory("BIKE");
        service.deliver();
        service = TransportFactory.createFactory("CAR");
        service.deliver();
    }
}


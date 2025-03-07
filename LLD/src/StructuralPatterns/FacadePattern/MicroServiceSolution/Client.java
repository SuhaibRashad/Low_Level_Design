package StructuralPatterns.FacadePattern.MicroServiceSolution;

public class Client {
    public static void main(String[] args) {
        // Client code interacting with different services directly
        ServiceFacade apiGateWay = new ServiceFacade();
        System.out.println(apiGateWay.getFullOrderDetails("rsqsi@5","OD:406-34","gpay@hadfc"));

    }
}

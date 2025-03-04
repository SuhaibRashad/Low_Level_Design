package StructuralPatterns.ProxyPattern.Employee;

public class Client {
    public static void main(String[] args) {
    EmployeeDAO dao = new EmployeeDAOProxy();
    dao.create("ADMIN", new EmployeeDo().get());
    }
}

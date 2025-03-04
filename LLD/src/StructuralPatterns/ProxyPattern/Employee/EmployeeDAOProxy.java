package StructuralPatterns.ProxyPattern.Employee;

public class EmployeeDAOProxy implements EmployeeDAO{

    EmployeeDAO employeeDAOobj;
    EmployeeDAOProxy(){
        employeeDAOobj = new EmployeeDAOImpl();
    }

    @Override
    public void create(String input, EmployeeDAO obj) {
        if (input == "ADMIN"){
            employeeDAOobj.create(input, obj);
            return;
        }
        System.out.println("Create Access Denied: " + input);
    }

    @Override
    public void delete(String input, int employeeId) {
        if (input == "ADMIN"){
            employeeDAOobj.delete(input, employeeId);
            return;
        }
        System.out.println("Delete Access Denied: " + input);

    }

    @Override
    public EmployeeDAO get(String client, int employeeId) {
        if (client == "ADMIN" || client == "USER"){
            return employeeDAOobj.get(client, employeeId);
        }

        System.out.println("Get Access Denied: " + client);
        return null;
    }
}

package StructuralPatterns.ProxyPattern.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void create(String input, EmployeeDAO obj) {
        System.out.println("created employee");
    }

    @Override
    public void delete(String input, int employeeId) {
        System.out.println("deleted employee "+ employeeId );
    }

    @Override
    public EmployeeDAO get(String client, int employeeId) {
        return new EmployeeDo().get();
    }
}

class EmployeeDo extends EmployeeDAOImpl{

    EmployeeDAOImpl get(){
        return new EmployeeDAOImpl();
    }

}
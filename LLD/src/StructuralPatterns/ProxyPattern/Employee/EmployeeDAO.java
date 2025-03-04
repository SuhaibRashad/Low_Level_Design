package StructuralPatterns.ProxyPattern.Employee;

public interface EmployeeDAO {
   public void create(String input, EmployeeDAO obj);
    public void delete(String input, int employeeId);
    public EmployeeDAO get(String client, int employeeId);

}

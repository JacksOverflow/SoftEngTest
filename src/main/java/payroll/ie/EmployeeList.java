package payroll.ie;

import java.util.ArrayList;

public class EmployeeList {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    int size = 0;

    public void addEmployee(Employee employee){
        if(!employeeList.contains(employee)){
            employeeList.add(employee);
            ++size;
        }else{
            throw new IllegalArgumentException("List already contains " + employee);
        }
    }

    public int getListSize(){
        return size;
    }

}

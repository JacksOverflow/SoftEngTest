package payroll.ie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeListTest {

    @Test
    public void testAddEmployeeMethod() throws Exception{
        EmployeeList list = new EmployeeList();
        Employee testEmployee = new Employee("Mr", "David", 123456, 1234567, "full-time", 18);
        Employee testEmployee1 = new Employee("Mrs", "Becky", 135791, 7654321, "full-time", 30);
        list.addEmployee(testEmployee); //success
        list.addEmployee(testEmployee1); //success
    }

    @Test
    public void testAddExistingEmployee() throws Exception{
        EmployeeList list = new EmployeeList();
        Employee testEmployee = new Employee("Mr", "David", 123456, 1234567, "full-time", 18);
        list.addEmployee(testEmployee); //success

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            list.addEmployee(testEmployee);
        } );
        Assertions.assertEquals("List already contains " + testEmployee, exception.getMessage());
    }

    @Test
    public void testGetListSizeMethod() throws Exception{
        EmployeeList list = new EmployeeList();
        Employee testEmployee = new Employee("Mr", "David", 123456, 1234567, "full-time", 18);
        list.addEmployee(testEmployee);
        Assertions.assertEquals(list.getListSize(), 1);

        Employee testEmployee1 = new Employee("Mrs", "Becky", 135791, 7654321, "full-time", 30);
        list.addEmployee(testEmployee1);
        Assertions.assertEquals(list.getListSize(), 2);
    }

}

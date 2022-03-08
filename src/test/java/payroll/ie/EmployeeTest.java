package payroll.ie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void instantiateEmployeeWhenBuilt() throws Exception {
        Employee testEmployee = new Employee("Mr", "David", 123456, 1234567, "full-time", 18);
        Assertions.assertNotNull(testEmployee);
    }

    @Test
    public void exceptionThrownWhenTitleInvalid(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Employee testEmployee = new Employee("Dr", "David", 123456, 1234567, "full-time", 18);
        } );
        Assertions.assertEquals("Invalid Title... must be Mr,Mrs,Ms", exception.getMessage());
    }

    @Test
    public void exceptionThrownWhenNameInvalid(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Employee testEmployee = new Employee("Mr", "John", 123456, 1234567, "full-time", 18);
        } );
        Assertions.assertEquals("Invalid Name... length must be between 5 and 22 characters", exception.getMessage());
    }

    @Test
    public void exceptionThrownWhenPpsIdInvalid(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Employee testEmployee = new Employee("Mr", "David", 12345, 1234567, "full-time", 18);
        } );
        Assertions.assertEquals("Invalid PPS ID... must be 6 digits", exception.getMessage());
    }

    @Test
    public void exceptionThrownWhenPhoneInvalid(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Employee testEmployee = new Employee("Mr", "David", 123456, 12345678, "full-time", 18);
        } );
        Assertions.assertEquals("Invalid Phone Number... must be 7 digits", exception.getMessage());
    }

    @Test
    public void exceptionThrownWhenEmploymentTypeInvalid(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Employee testEmployee = new Employee("Mr", "David", 123456, 1234567, "weekends", 18);
        } );
        Assertions.assertEquals("Invalid Employment Type... must be 'Full-time' or 'Part-time'", exception.getMessage());
    }

    @Test
    public void exceptionThrownWhenAgeInvalid(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Employee testEmployee = new Employee("Mr", "David", 123456, 1234567, "full-time", 17);
        } );
        Assertions.assertEquals("Underage... must be 18+", exception.getMessage());
    }


}

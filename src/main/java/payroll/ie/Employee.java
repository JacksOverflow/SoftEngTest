package payroll.ie;

public class Employee{
    String title;
    String name;
    int ppsID;
    int phone;
    String employmentType;
    int age;

    Employee(String title, String name, int ppsID, int phone, String employmentType, int age) throws Exception {
        if(title == "Mr" || title == "Mrs" || title == "Ms"){
            this.title = title;
        } else{
            throw new IllegalArgumentException("Invalid Title... must be Mr,Mrs,Ms");
        }
        if(name.length() >= 5 && name.length() <= 22){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Invalid Name... length must be between 5 and 22 characters");
        }
        if(String.valueOf(ppsID).length() == 6){
            this.ppsID = ppsID;
        }else{
            throw new IllegalArgumentException("Invalid PPS ID... must be 6 digits");
        }
        if(String.valueOf(phone).length() == 7){
            this.phone = phone;
        }else{
            throw new IllegalArgumentException("Invalid Phone Number... must be 7 digits");
        }
        if(employmentType.equalsIgnoreCase("Full-time") || employmentType.equalsIgnoreCase("Part-time")){
            this.employmentType = employmentType;
        } else{
            throw new IllegalArgumentException("Invalid Employment Type... must be 'Full-time' or 'Part-time'");
        }

        if(age >= 18){
            this.age = age;
        } else{
            throw new IllegalArgumentException("Underage... must be 18+");
        }

    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public int getPpsID() {
        return ppsID;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getAge() {
        return age;
    }

}

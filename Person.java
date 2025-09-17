public class Person {
    private String schoolId;
    private String firstName;
    private String lastName;
    private String uscEmail;

    public Person(String schoolId, String firstName, String lastName, String uscEmail) {
        this.schoolId = schoolId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uscEmail = uscEmail;
    }

    public String getSchoolId() { 
        return schoolId; 
    }

    public void setSchoolId(String schoolId) { 
        this.schoolId = schoolId; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }

    public void setLastName(String lastName) { 
        this.lastName = lastName; 
    }

    public String getUscEmail() { 
        return uscEmail; 
    }

    public void setUscEmail(String uscEmail) { 
        this.uscEmail = uscEmail; 
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Name: %-15s | Email: %-25s", 
                              schoolId, getFullName(), uscEmail);
    }
}
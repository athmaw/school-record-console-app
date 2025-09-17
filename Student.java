public class Student extends Person {
    private String course;
    private int year;

    public Student(String schoolId, String firstName, String lastName, String uscEmail, String course, int year) {
        super(schoolId, firstName, lastName, uscEmail);
        this.course = course;
        this.year = year;
    }

    public String getCourse() { 
        return course; 
    }

    public void setCourse(String course) { 
        this.course = course; 
    }

    public int getYear() { 
        return year; 
    }

    public void setYear(int year) { 
        this.year = year; 
    }

    @Override
    public String toString() {
        return String.format("[STUDENT] %-60s | Course: %-10s | Year: %d",
                              super.toString(), course, year);
    }
}
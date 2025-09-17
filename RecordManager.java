import java.util.*;

public class RecordManager {
    private ArrayList<Person> records = new ArrayList<>();

    public void addRecord(Person p) {
        records.add(p);
        System.out.println("Record added successfully!");
    }

    public void displayAll() {

        if(records.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for(Person p : records) {
            System.out.println(p);
        }
    }

    public void displayById(String id) {

        for(Person p : records) {
            if(p.getSchoolId().equals(id)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public void updateRecord(String id, Person updated) {

        for(int i = 0; i < records.size(); i++) {
            if(records.get(i).getSchoolId().equals(id)) {
                records.set(i, updated);
                System.out.println("Record updated successfully!");
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public void deleteRecord(String id) {
        Iterator<Person> iterator = records.iterator();

        while(iterator.hasNext()) {
            Person p = iterator.next();
            if(p.getSchoolId().equals(id)) {
                iterator.remove();
                System.out.println("Record deleted successfully!");
                return;
            }
        }
        System.out.println("Record not found.");
    }
}
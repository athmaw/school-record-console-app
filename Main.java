import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecordManager manager = new RecordManager();
        int choice;

        do{
            System.out.println("\n--- School Record Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Staff");
            System.out.println("3. Display All Records");
            System.out.println("4. Display Single Record");
            System.out.println("5. Update Record");
            System.out.println("6. Delete Record");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter School ID: ");
                    String sId = sc.nextLine();
                    System.out.print("First Name: ");
                    String fName = sc.nextLine();
                    System.out.print("Last Name: ");
                    String lName = sc.nextLine();
                    System.out.print("USC Email: ");
                    String email = sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt(); sc.nextLine();
                    manager.addRecord(new Student(sId, fName, lName, email, course, year));
                    break;

                case 2:
                    System.out.print("Enter School ID: ");
                    String staffId = sc.nextLine();
                    System.out.print("First Name: ");
                    String sfName = sc.nextLine();
                    System.out.print("Last Name: ");
                    String slName = sc.nextLine();
                    System.out.print("USC Email: ");
                    String sEmail = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    manager.addRecord(new Staff(staffId, sfName, slName, sEmail, dept));
                    break;

                case 3:
                    manager.displayAll();
                    break;

                case 4:
                    System.out.print("Enter School ID: ");
                    String id = sc.nextLine();
                    manager.displayById(id);
                    break;

                case 5:
                    System.out.print("Enter ID of record to update: ");
                    String updateId = sc.nextLine();
                    System.out.println("Is this a Student (1) or Staff (2)? ");
                    int type = sc.nextInt(); sc.nextLine();

                    if(type == 1) {
                        System.out.print("First Name: ");
                        String ufName = sc.nextLine();
                        System.out.print("Last Name: ");
                        String ulName = sc.nextLine();
                        System.out.print("USC Email: ");
                        String uEmail = sc.nextLine();
                        System.out.print("Course: ");
                        String uCourse = sc.nextLine();
                        System.out.print("Year: ");
                        int uYear = sc.nextInt(); sc.nextLine();
                        manager.updateRecord(updateId, new Student(updateId, ufName, ulName, uEmail, uCourse, uYear));
                    } else{
                        System.out.print("First Name: ");
                        String ufName = sc.nextLine();
                        System.out.print("Last Name: ");
                        String ulName = sc.nextLine();
                        System.out.print("USC Email: ");
                        String uEmail = sc.nextLine();
                        System.out.print("Department: ");
                        String uDept = sc.nextLine();
                        manager.updateRecord(updateId, new Staff(updateId, ufName, ulName, uEmail, uDept));
                    }
                    break;

                case 6:
                    System.out.print("Enter ID of record to delete: ");
                    String deleteId = sc.nextLine();
                    manager.deleteRecord(deleteId);
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 7);

        sc.close();
    }
}
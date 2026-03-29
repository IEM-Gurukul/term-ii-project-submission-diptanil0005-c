import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample members
        Member student = new StudentMember(101, "Raj");
        Member faculty = new FacultyMember(201, "Dr. Sharma");

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // clear buffer
                        System.out.print("Enter Book Title: ");
                        String title = sc.nextLine();

                        library.addBook(new Book(id, title));
                        System.out.println("Book added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();

                        System.out.println("Select Member: 1.Student  2.Faculty");
                        int mChoice = sc.nextInt();

                        Member m1 = (mChoice == 1) ? student : faculty;

                        library.issueBook(m1, issueId);
                        break;

                    case 3:
                        System.out.print("Enter Book ID to return: ");
                        int returnId = sc.nextInt();

                        System.out.println("Select Member: 1.Student  2.Faculty");
                        int mChoice2 = sc.nextInt();

                        Member m2 = (mChoice2 == 1) ? student : faculty;

                        library.returnBook(m2, returnId);
                        break;

                    case 4:
                        library.displayBooks();
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (BookNotAvailableException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
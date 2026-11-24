
import java.util.Scanner;

// Enumeration to represent result status
enum Result {
    PASS, FAIL, ABSENT
}

class Student {
    String USN;
    String Name;
    Integer Marks;
    Result status;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Marks (-1 for Absent): ");
        int m = sc.nextInt();

        Marks = m;

        int marks = Marks;

        if (marks == -1) {
            status = Result.ABSENT;
        } 
        else if (marks >= 40) {
            status = Result.PASS;
        } 
        else {
            status = Result.FAIL;
        }
    }

    void displayResult() {
        System.out.println("\n----- Examination Result -----");
        System.out.println("USN          : " + USN);
        System.out.println("Name         : " + Name);
        System.out.println("Marks        : " + Marks);
        System.out.println("Result Status: " + status);
    }
}

public class OnlineExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.acceptDetails(sc);
        s.displayResult();

        sc.close();
    }
}

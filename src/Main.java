import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findValue();
    }

    public static void findValue() {
        String[] students = {"Linh", "Hau", "Duc Anh", "Son", "Pro"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name of student: ");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + inputName + " in the list");
        }

    }
}

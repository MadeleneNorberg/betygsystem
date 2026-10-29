import java.util.Scanner;

public class Menu {

        private Student student;
        private Scanner scanner;

        public Menu() {
            student = new Student();
            scanner = new Scanner(System.in);
        }

        public void run() {

            int choice;

            do {
                System.out.println("\n----- MENY -----");
                System.out.println("1. Visa alla elever");
                System.out.println("2. Visa statistik");
                System.out.println("3. Sök elev");
                System.out.println("4. Avsluta");
                System.out.print("Val: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        student.printStudentAndGrade();
                        break;

                    case 2:
                        printStatistics();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        System.out.println("Programmet avslutas.");
                        break;

                    default:
                        System.out.println("Ogiltigt val.");
                }

            } while (choice != 4);
        }

        private void printStatistics() {
            System.out.println("Antal elever: " + student.countStudents());
            System.out.println("Godkända: " + student.g_Students());
            System.out.println("Underkända: " + student.u_Student());
            System.out.println("Högsta resultat: " + student.highestStudent());
            System.out.println("Lägsta resultat: " + student.lowestStudent());
            System.out.println("Medelpoäng: " + student.averageGrade());
        }

        private void searchStudent() {
            System.out.print("Ange elevnamn: ");
            String name = scanner.nextLine();
            System.out.println(student.searchStudent(name));
        }
    }


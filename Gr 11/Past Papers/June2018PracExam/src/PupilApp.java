import java.util.Scanner;

public class PupilApp {
  public static void main(String[] args) {

    // Input data
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name = scan.next();
    System.out.print("Enter Grade: ");
    int grade = scan.nextInt();
    System.out.print("First Aid Capable (Y/N): ");
    char firstAidString = scan.next().charAt(0);
    boolean firstAidBooleann = (firstAidString == 'Y');
    System.out.print("Enter Rating: ");
    int rating = scan.nextInt();
    scan.close();

    // Instatiating object with input data
    Pupil pupil = new Pupil(name, grade, firstAidBooleann, rating);

    // Output object
    System.out.println(pupil);
  }
}

import java.util.Scanner;
public class Tutorial8 {
    public static void main(String[] args) {
        System.out.println("Enter marks: ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks >= 70) {
            System.out.println("A grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B grade");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Tutorial6 {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner scanner = new Scanner(System.in); 
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Non-eligible"); 
        }
        scanner.close(); 
    }
}

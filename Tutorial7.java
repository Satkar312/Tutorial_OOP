import java.util.Scanner;

public class Tutorial7 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner scanner = new Scanner(System.in); 
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("A is smaller than B"); 
        }
        scanner.close(); 
    }
}

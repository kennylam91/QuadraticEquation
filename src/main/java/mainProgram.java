import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation1.getRoot());
    }
}
